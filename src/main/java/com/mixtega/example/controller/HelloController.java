package com.mixtega.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String getHelloWorld(){
       return "Hello World with/Spring";
    }
}
