package com.example.service;

import com.example.entity.CourseEntity;
import com.example.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    private List<CourseEntity> courses = new ArrayList<>();
    private CourseEntity courseEntity;

    @Autowired
    public CourseService(CourseEntity courseEntity){
        this.courseEntity = courseEntity;
    }

    public void addCourse(Course course){
        courseEntity.setId(course.getId());
        courseEntity.setName(course.getName());
        courseEntity.setFees(course.getFees());
        courseEntity.setDuration(course.getDuration());

        courses.add(courseEntity);
    }

    public List<CourseEntity> getCourses(){
        return courses;
    }
}
