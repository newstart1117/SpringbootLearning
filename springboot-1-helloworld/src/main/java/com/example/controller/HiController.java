package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HiController {

    @ResponseBody
    @GetMapping("/hi")
    @PostMapping("/hi")
    @PutMapping("/hi")
    @DeleteMapping("/hi")
    public String hi(){
        return "hi";
    }
    @GetMapping("/hiPage")
    public String hiPage(){
        return "hi";
    }
}
