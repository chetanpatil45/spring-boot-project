package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LocalHostHandler {
    @GetMapping
    public String openLocalHost(){
        return "Welcome....!";
    }


    @GetMapping("studentapi")
    public String demo(){
        return "<h1>Hello Student</h1>";
    }
}
