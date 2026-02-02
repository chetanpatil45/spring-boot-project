package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocalHostHandler {
    @GetMapping({"/","/home"})
    public String openLocalHost(){
        return "index";
    }

//   @GetMapping("studentapi")
//    public String demo(){
//        return "<h1>Hello Student</h1>";
//    }
}
