package com.digitalacademy.helloSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class Home {

    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping(path = "/hello/{name}")
    public String getName(@PathVariable String name){
        return "Hello" + name;
    }
}
