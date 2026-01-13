package com.example.controller;

import com.example.entity.StudentEntity;
import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Student Added";
    }

    @GetMapping("/allstudents")
    public List<StudentEntity> getAllStudents(){
        return studentService.getStudents();
    }

    @GetMapping("email")
    public String getEmail(){
        return "Email";
    }

    @PutMapping("/update/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student student){
        return studentService.updateStudent(id,student) ? "Student Updated..." : "Failed to update...";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        return studentService.deleteStudent(id) ? "Student deleted..." : "Failed to delete";
    }

    @GetMapping("/get/{id}")
    public Student getStudent(@PathVariable int id){
        return studentService.getStudent(id);
    }
}
