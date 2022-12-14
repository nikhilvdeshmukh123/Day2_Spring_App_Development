package com.bridgelabz.springappdevelopment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    //curl localhost:8080/hello/home -w "\n"
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello(){
        return "Hello From Bridgelabz";
    }
}
