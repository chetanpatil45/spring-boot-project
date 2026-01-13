package com.example.controller;

import com.example.entity.StudentEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/studentapi/students")
public class StudentController {
    List<StudentEntity> list = new ArrayList<>();

    @GetMapping
    public String demo(){
        list.add(new StudentEntity(1,"chetan","chetan@gmail.com"));
        list.add(new StudentEntity(2,"prafulla","prafulla@gmail.com"));
        list.add(new StudentEntity(3,"dipak","dipak@gmail.com"));
        list.add(new StudentEntity(4,"prakash","prakash@gmail.com"));
        list.add(new StudentEntity(5,"dhiraj","dhiraj@gmail.com"));

        return "Students -> ";
    }

    @PostMapping("/addstudent")
    public void addStudent(@RequestBody StudentEntity student){
        list.add(student);
    }

    @GetMapping("/allstudents")
    public List<StudentEntity> getAllStudents(){
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

    @GetMapping("email")
    public String getEmail(){
        return "Email";
    }
}
