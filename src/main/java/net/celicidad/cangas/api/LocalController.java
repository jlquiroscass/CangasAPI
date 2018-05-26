package net.celicidad.cangas.api;

import net.celicidad.cangas.data.Locales;
import net.celicidad.cangas.model.Local;
import net.celicidad.cangas.model.Tipo;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/")
public class LocalController {

    private List<Local> locales = Locales.listaLocales();

    @RequestMapping(value = "tipo/{tipo}/", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    @Cacheable("tipos")
    public ResponseEntity<List<Local>> getLocalFromTipo(@PathVariable(value = "tipo") Long tipo) {
        if (tipo == -1) {
            return new ResponseEntity<>(locales, HttpStatus.OK);
        }
        String tipoString = Tipo.getTipos().get(tipo);
        if (tipo == 0L || tipo == 1L) {
            return new ResponseEntity<>(locales.stream().filter(local -> (local.getType().equals(tipoString) || local.getType().equals(Tipo.RESTAURANTE_ALOJAMIENTO))).collect(Collectors.toList()), HttpStatus.OK);
        }
        return new ResponseEntity<>(locales.stream().filter(local -> local.getType().equals(tipoString)).collect(Collectors.toList()), HttpStatus.OK);
    }

    @RequestMapping(value = "{id}/", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    @Cacheable("local")
    public ResponseEntity<Local> getLocal(@PathVariable(value = "id") int id) {
        for (Local localaux : locales) {
            if (localaux.getId() == id) {
                return new ResponseEntity<>(localaux, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(new Local(), HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "jornadas/", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    @Cacheable("tiposJornadas")
    public ResponseEntity<List<Local>> getLocalInJornadas() {
        List<Local> localesJornadas = locales.stream().filter(local -> local.isContestant()).collect(Collectors.toList());
        return new ResponseEntity<>(localesJornadas, HttpStatus.OK);
    }
}
