package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.HistorialesDao;
import com.example.demo.models.Historiales;


@RestController
//Ruta para el frontend
@CrossOrigin(origins={"http://127.0.0.1:5502"})
//Ruta para aceder desde el navegador
@RequestMapping(value = "/historial")
//clase
public class HistorialesController {
    
    @Autowired
    private HistorialesDao dao;
    
   @GetMapping( "/{id}")
    public ResponseEntity<List<Historiales>> buscarHistoriales(@PathVariable("id") Long id) {
         if(id != null && id != 0){
            List <Historiales> historialBD = (List <Historiales>) dao.getReferenceById(id);
           return  ResponseEntity.ok(historialBD);
          }  
        return null;
 }
    @PostMapping("/")
    public void  crearHistorial (@RequestBody Historiales historial){
             dao.save(historial);
        }
    
    @PutMapping("/")
    public void actualizarHistorial(@RequestBody Historiales historial){
        dao.save(historial);
    }
    
    @DeleteMapping("/{id}")
    public void eliminarHistorial(@PathVariable("id") Long id){
        dao.deleteById(id);
    }


}

