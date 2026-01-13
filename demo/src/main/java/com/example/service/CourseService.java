package com.example.service;

import com.example.entity.CourseEntity;
import com.example.model.Course;
import com.example.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
//    private List<CourseEntity> courses = new ArrayList<>();
    private CourseEntity courseEntity = new CourseEntity();

    private CourseRepo courseRepo;

    @Autowired
    public CourseService(CourseRepo repo){
        this.courseRepo = repo;
    }

    public void addCourse(Course course){
        courseEntity.setId(course.getId());
        courseEntity.setName(course.getName());
        courseEntity.setFees(course.getFees());
        courseEntity.setDuration(course.getDuration());

        courseRepo.save(courseEntity);

//        courses.add(courseEntity);
    }

    public List<CourseEntity> getCourses(){
//        return courses;
        return courseRepo.findAll();
    }
}
