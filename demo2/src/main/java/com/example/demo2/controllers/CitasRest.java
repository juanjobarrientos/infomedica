package com.example.demo2.controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo2.dao.CitasDao;
import com.example.demo2.dao.HistorialesDao;
import com.example.demo2.models.Citas;
import com.example.demo2.models.Historiales;

@RestController
@CrossOrigin("*")
public class CitasRest {

    @Autowired
    private CitasDao dao;

    @Autowired
    private HistorialesDao daoH;

    @GetMapping("/citas")
    public List <Citas> getCitas(){
        List <Citas> citasBD = dao.findAll();
        return citasBD;
    }
    
    @GetMapping("/{id}")
    public Optional<Citas> buscarCita(@PathVariable("id") Long id) {
         if(id != null && id != 0){
            Optional<Citas> citaBD = dao.findById(id);
           return citaBD;
          }  
        return null;
    }
    
    @PostMapping(path = "/", 
    consumes = "application/x-www-form-urlencoded;charset=UTF-8", 
    produces = "application/json")
    public RedirectView crearCita(@ModelAttribute("form") Citas cita){
        System.out.println(cita);
        dao.save(cita);
        long idCita = cita.getId_ct();
        Historiales historial = new Historiales();
        historial.setId_ctfk(idCita);
        daoH.save(historial);
        return new RedirectView("/");
    }
    
    @PostMapping("/actualizarct")
    public RedirectView actualizarCita(@ModelAttribute("form") Citas cita){
        System.out.println(cita.getId_ct());
        dao.save(cita);
        return new RedirectView("/");
    }
    
    @PostMapping("/delete")
    public RedirectView borrarCita(@ModelAttribute("form") Citas cita){
        Long id = cita.getId_ct();
        dao.deleteById(id);
        return new RedirectView("/");
    }
   

    //API de historiales

    @GetMapping("/historiales/{id_ct}")
    public Optional<Historiales> buscarHistoriales(@PathVariable("id_ct") Long id) {
        if(id != null && id != 0){
            Optional<Historiales> historialBD = daoH.findById(id);
            System.out.println(historialBD);
            return historialBD;
        }  
        return null;
    }

    @PostMapping("/historiales/actualizarhs")
    public RedirectView actualizarHistorial(@ModelAttribute("form") Historiales historial){
        daoH.save(historial);
        return new RedirectView("/");
    }

}
