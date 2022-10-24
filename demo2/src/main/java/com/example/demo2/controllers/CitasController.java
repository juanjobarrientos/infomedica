package com.example.demo2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CitasController {
    
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/agregar")
    public String citas(){
        return "citas";
    }

    @GetMapping("/editarcita/{id}")
    public String editarcita(@PathVariable ("id") Long id, Model model){
        model.addAttribute("idEditar", id);
        return "editar_citas";
    }
    
    @GetMapping("/historial/{id}")
    public String historial(@PathVariable ("id") Long id, Model model){
        model.addAttribute("idHistorial", id);
        return "historial";
    }
}

