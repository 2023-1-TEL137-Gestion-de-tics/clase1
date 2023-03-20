package com.example.holamundo.controllers;

import com.example.holamundo.beans.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/persona")
public class PersonaController {

    @GetMapping("/registro")
    public String abrirForm(){
        return "formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@RequestParam("nombre") String nombre,
                          @RequestParam("apellido") String apellido,
                          @RequestParam("dni") String dni,
                          Model model){
        System.out.println("nombre recibido = " + nombre);
        model.addAttribute("nombre",nombre.toUpperCase());
        model.addAttribute("apellido",apellido.toLowerCase());
        model.addAttribute("dni",dni);

        Persona persona = new Persona();
        persona.setNombre(nombre + " " + apellido);
        model.addAttribute("persona",persona);

        Persona p = new Persona();
        p.setNombre("david");
        model.addAttribute("persona2",p);
        return "datosUsuario";
    }
}
