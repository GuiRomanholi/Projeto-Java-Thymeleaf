package br.com.fiap.projetos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavegationController {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/sobre")
    public String sobre() {
        return "sobre";
    }


    @GetMapping("/contato")
    public String contato() {
        return "contato";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}

