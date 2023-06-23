package com.studi.cicddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello(@RequestParam(name="nom" , required = false, defaultValue = "Tamba")String nom) {
        return "Salut " + nom  + ", bienvenue au Spring-Boot CI/CD demo";

    }

}
