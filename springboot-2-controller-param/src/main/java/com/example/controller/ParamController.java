package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class ParamController {

    @GetMapping("/param1")
    public String param1(@RequestParam(value = "name", defaultValue = "Sung") String name){
        return "param1: " + name;
    }

    @GetMapping("/param2")
    public String param2(@RequestParam(required = false, defaultValue = "aa") String name){
        return "param2: " + name;
    }
    @GetMapping("/param3/{name}")
    public String param3(@PathVariable String name){
        return "param3: " + name;
    }

}
