package com.example.controller;

import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocalHostHandler {
    @Autowired
    StudentService studentService;

    @GetMapping({"","/","/home"})
    public String openHomePage(Model model){
        model.addAttribute("todos", studentService.getAllStud());
        return "index";
    }

//   @GetMapping("studentapi")
//    public String demo(){
//        return "<h1>Hello Student</h1>";
//    }
}
