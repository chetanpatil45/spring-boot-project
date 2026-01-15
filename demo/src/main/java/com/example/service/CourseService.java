package com.example.service;

import com.example.entity.CourseEntity;
import com.example.entity.StudentEntity;
import com.example.model.Course;
import com.example.model.Student;
import com.example.repository.CourseRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    //    private List<CourseEntity> courses = new ArrayList<>();
    private CourseEntity courseEntity = new CourseEntity();

    private CourseRepo courseRepo;

    @Autowired
    public CourseService(CourseRepo repo) {
        this.courseRepo = repo;
    }

    public void addCourse(Course course) {
        courseEntity.setId(course.getId());
        courseEntity.setName(course.getName());
        courseEntity.setFees(course.getFees());
        courseEntity.setDuration(course.getDuration());

        courseRepo.save(courseEntity);

//        courses.add(courseEntity);
    }

    public List<CourseEntity> getCourses() {
//        return courses;
        return courseRepo.findAll();
    }

    @Transactional
    public boolean updateCourse(int id, Course course) {

        try {
            CourseEntity existing = courseRepo.findById(id).
                    orElseThrow(() -> new RuntimeException("Student not found"));

            existing.setName(course.getName());
            existing.setFees(course.getFees());
            existing.setDuration(course.getDuration());
            courseRepo.save(existing);

            return true;

        } catch (RuntimeException e) {
            return false;
        }
    }

    @Transactional
    public boolean deleteCourse(int id) {
        if (courseRepo.existsById(id)) {
            courseRepo.deleteById(id);
            return true;
        }

        return false;
    }

    public Course getStudent(int id) {
        CourseEntity courseEntity;
        try {
            courseEntity = courseRepo.findById(id)
                    .orElseThrow(() -> new RuntimeException("No course with this id"));

            return new Course(courseEntity.getId(), courseEntity.getName(), courseEntity.getFees(), courseEntity.getDuration());
        } catch (RuntimeException e) {
            return null;
        }
    }
}
