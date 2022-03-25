package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hi/{name}")
    public String hi(@PathVariable String name){
        return "hi, " + name;
    }
}
