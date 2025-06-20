package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HolaController {


    @GetMapping("/hola")
    public String mostrarHola(Model model) {
        model.addAttribute("mensaje", "Hola Mundo desde Spring Boot + Thymeleaf en JBoss");
        return "hola";
    }
}
