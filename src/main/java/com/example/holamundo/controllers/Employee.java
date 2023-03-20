package com.example.holamundo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/employee")
public class Employee {

    @ResponseBody
    @RequestMapping(value = {"/listar", "/",""})
    public String listar() {
        return "listar employee hr";
    }

    @ResponseBody
    @RequestMapping("/crear")
    public String crear() {
        return "crear employee hr";
    }

    @ResponseBody
    @RequestMapping("/editar")
    public String editar() {
        return "editar employee hr";
    }



}
