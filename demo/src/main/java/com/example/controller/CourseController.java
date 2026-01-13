package com.example.controller;

import com.example.entity.CourseEntity;
import com.example.model.Course;
import com.example.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/studentapi/courses")
public class CourseController {

    @Autowired
    CourseService service;

    @GetMapping()
    public String demo(){
        return "Courses -> ";
    }

    @GetMapping("/allcourses")
    public List<CourseEntity> getAllCourse(){
        return service.getCourses();
    }

    @PostMapping("/addcourse")
    public void addCourse(@RequestBody Course course){
        service.addCourse(course);
        return;
    }

    @GetMapping("/courseid")
    public String getCourseId(){
        return "Course id :: ";
    }

    @GetMapping("/coursename")
    public String getCourseName(){
        return "Course Name :: ";
    }

    @GetMapping("/course")
    public CourseEntity getCourse(){
        return new CourseEntity();
    }
}
