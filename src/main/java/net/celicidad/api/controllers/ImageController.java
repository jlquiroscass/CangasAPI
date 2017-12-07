package net.celicidad.api.controllers;

import net.celicidad.dbclient.model.Valoracion;
import net.celicidad.dbclient.service.CommentService;
import net.celicidad.pojo.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/image")
public class ImageController {

    @Autowired
    private CommentService commentRepository;

    @RequestMapping(value="/",method = RequestMethod.POST)
    public ResponseEntity<String> image(@RequestBody Image image) {

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
