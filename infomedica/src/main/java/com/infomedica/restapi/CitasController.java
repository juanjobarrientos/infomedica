package com.infomedica.restapi;

import com.infomedica.DAO.CitasDAO;
import com.infomedica.model.Citas;
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


@RestController
@CrossOrigin(origins={"http://127.0.0.1:5502"})
@RequestMapping(value = "/")
public class CitasController {
    
    @Autowired
    private CitasDAO dao;
    
    @GetMapping("/")
    public ResponseEntity<List<Citas>> listarCitas(){
        List <Citas> listado =  dao.findAll();
        return ResponseEntity.ok(listado);
    }
    
     @GetMapping( "/{id}")
    public ResponseEntity<List<Citas>> buscarCita(@PathVariable("id") Long id) {
         if(id != null && id != 0){
            List <Citas> citaBD =  (List <Citas>) dao.getReferenceById(id);
           return  ResponseEntity.ok(citaBD);
          }  
        return null;
    }
    
    @PostMapping("/")
    public void crearCita(@RequestBody Citas cita){
        dao.save(cita);
    }
    
    @PutMapping("/")
    public void actualizarCita(@RequestBody Citas cita){
        dao.save(cita);
    }
    
    @DeleteMapping("/{id}")
    public void borrarCita(@PathVariable Long id){
        dao.deleteById(id);
    }
   
}
