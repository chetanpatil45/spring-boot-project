package com.example.controller;

import com.example.entity.CourseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/studentapi/courses")
public class CourseController {

    @GetMapping()
    public String demo(){
        return "Courses -> ";
    }

    @GetMapping("/getall")
    public List<CourseEntity> getAllCourse(){
        List<CourseEntity> list = new ArrayList<>();

        list.add(new CourseEntity(101,"Java",3500));
        list.add(new CourseEntity(102,"Python",4000));
        list.add(new CourseEntity(103,"C++",3000));

        return list;
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
