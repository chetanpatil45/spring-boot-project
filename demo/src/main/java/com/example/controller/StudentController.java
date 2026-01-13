package com.example.controller;

import com.example.entity.StudentEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/studentapi")
public class StudentController {

    @GetMapping
    public String demo(){
        return "<h1>Hello world</h1>";
    }

    @GetMapping("/students")
    public List<StudentEntity> getAllStudents(){
        List<StudentEntity> list = new ArrayList<>();

        list.add(new StudentEntity(1,"chetan","chetan@gmail.com"));
        list.add(new StudentEntity(2,"prafulla","prafulla@gmail.com"));
        list.add(new StudentEntity(3,"dipak","dipak@gmail.com"));
        list.add(new StudentEntity(4,"prakash","prakash@gmail.com"));
        list.add(new StudentEntity(5,"dhiraj","dhiraj@gmail.com"));

        return list;
    }


    @GetMapping("/roll")
    public String getRoll(){
        return "The roll number is :: 12";
    }

    @GetMapping("/name")
    public String getName(){
        return "<h1>Name : Chetan bachchhav </h1>";
    }
}
