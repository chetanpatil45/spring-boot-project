package com.example.controller;

import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;


    @PostMapping("/add")
    public String addStudent(@ModelAttribute Student student){
        studentService.addStudent(student);
//        return "Student Added";
        return "redirect:/home";
    }

    @PostMapping("/delete")
    public String deleteStudent(@RequestParam("id") int id) {
        studentService.deleteStudent(id);
        return "redirect:/home";
    }


//    @GetMapping("/allstudents")
//    public List<Stude"ntEntity> getAllStudents(){
//        return studentService.getStudents();
//    }
//
//    @GetMapping("email")
//    public String getEmail(){
//        return "Email";
//    }

//    @PutMapping("/update/{id}")
//    public String updateStudent(@PathVariable int id, @RequestBody Student student){
//        return studentService.updateStudent(id,student) ? "Student Updated..." : "Failed to update...";
//    }

//    @DeleteMapping("/delete/{id}")
//    public String deleteStudent(@PathVariable int id){
//        return studentService.deleteStudent(id) ? "Student deleted..." : "Failed to delete";
//    }

//    @GetMapping("/get/{id}")
//    public Student getStudent(@PathVariable int id){
//        return studentService.getStudent(id);
//    }
}
