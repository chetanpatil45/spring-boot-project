package com.example.controller;

import com.example.entity.StudentEntity;
import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/studentapi/students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping
    public String demo(){
        return "Students -> ";
    }

    @PostMapping("/addstudent")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping("/allstudents")
    public List<StudentEntity> getAllStudents(){
        return studentService.getStudents();
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
