package net.celicidad.api.controllers;

import net.celicidad.api.mapper.Utils.DozerUtils;
import net.celicidad.api.mapper.config.DozerConfig;
import net.celicidad.dbclient.model.Valoracion;
import net.celicidad.dbclient.service.CommentService;
import net.celicidad.pojo.model.Comment;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/comment")
public class CommentController {

    @Autowired
    private CommentService commentRepository;

    @RequestMapping(value="/",method = RequestMethod.POST)
    public ResponseEntity<String> comment(@RequestBody Comment comment) {
        DozerBeanMapper dozerBeanMapper = DozerUtils.getDozerBean(DozerConfig.class);
        try {
            Valoracion valoracion = dozerBeanMapper.map(comment, Valoracion.class);
            if (valoracion.getUid() == null) {
                valoracion.setUid(commentRepository.findUidByUniqueId(comment.getUnique_id()));
                Assert.isTrue(valoracion.getUid() != null, "Data Comment error");
            }
            commentRepository.save(valoracion);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<String>("KO", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<String>("OK", HttpStatus.OK);
    }

    @RequestMapping(value="/",method = RequestMethod.GET)
    public ResponseEntity<List<Valoracion>> comment() {
        try{
            List<Valoracion> list= commentRepository.doAll();
            return new ResponseEntity<List<Valoracion>>(list, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<List<Valoracion>>(new ArrayList<>(), HttpStatus.OK);
        }

    }

}
