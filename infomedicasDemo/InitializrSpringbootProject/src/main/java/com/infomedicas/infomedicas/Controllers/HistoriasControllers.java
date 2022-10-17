/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.infomedicas.infomedicas.Controllers;



import com.infomedicas.infomedicas.Model.Historiales;
import com.infomedicas.infomedicas.Servicelempl.ServiseHistorialmpl;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author USUARIO
 */
@RestController
//Ruta para el fonetd
@CrossOrigin(origins={"http://127.0.0.1:5502"})
//Ruta para aceder desde el navegador
@RequestMapping(value = "/historias")
//clase
public class HistoriasControllers {
    //conecion con el servidor de historiales 
    @Autowired
    private ServiseHistorialmpl ServiceHistoria;
    
     //Buscar una historia clinica
     @GetMapping(value = "")
     public ResponseEntity<List<Historiales>> ListaHistoriales(){
         List<Historiales> List = ServiceHistoria.getListaHistoriales();
         return  ResponseEntity.ok(List);
     }
     
    //guardar en base de datos
     @PostMapping(value = "")
    public ResponseEntity<Historiales> crearHistoriales(@Valid @RequestBody Historiales Citas, 
            BindingResult result) {
        if (result.hasErrors()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, result.getFieldError()
                    .getDefaultMessage());
        }
       
       Historiales crear = ServiceHistoria.crearHistoriales(Citas);
        return ResponseEntity.ok(crear);
    }
//    modificar base de datos
    
    @PutMapping(value = "")
    public ResponseEntity<Historiales> ActualizarHistoriales(@RequestBody Historiales Citas) {
        Historiales actualizar = ServiceHistoria.ActualizarHistoriales(Citas);
        return ResponseEntity.ok(actualizar);
    }
   @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> EliminarHistoriales(@PathVariable("id") Long id) {
        if (id != null) {
            if (ServiceHistoria.EliminarHistoriales(id)) {
                return ResponseEntity.ok().body("Eliminado");
            }
        }

        return ResponseEntity.notFound().build();
    }
     
      
}
