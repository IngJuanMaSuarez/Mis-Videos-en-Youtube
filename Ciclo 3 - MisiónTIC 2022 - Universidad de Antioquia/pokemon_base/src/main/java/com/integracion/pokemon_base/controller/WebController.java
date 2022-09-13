package com.integracion.pokemon_base.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class WebController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

}
