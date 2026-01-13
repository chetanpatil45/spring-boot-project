package com.example.service;


import com.example.entity.StudentEntity;
import com.example.model.Student;
import com.example.repository.StudentRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    //    private List<StudentEntity> students = new ArrayList<>();
    private StudentEntity studentEntity = new StudentEntity();
    private StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void addStudent(Student student) {
        studentEntity.setId(student.getId());
        studentEntity.setName(student.getName());
        studentEntity.setEmail(student.getEmail());
        studentEntity.setAge(student.getAge());

        studentRepo.save(studentEntity);

//        students.add(studentEntity);
    }

    public List<StudentEntity> getStudents() {
//        return students;

        return studentRepo.findAll();
    }

    @Transactional
    public boolean updateStudent(int id, Student student) {
        try {
            StudentEntity existing = studentRepo.findById(id).
                    orElseThrow(() -> new RuntimeException("Student not found.."));

            existing.setName(student.getName());
            existing.setEmail(student.getEmail());
            existing.setAge(student.getAge());

            studentRepo.save(existing);

            return true;
        } catch (RuntimeException e) {
            e.getMessage();
            return false;
        }
    }

    @Transactional
    public boolean deleteStudent(int id) {
        if (studentRepo.existsById(id)) {
            studentRepo.deleteById(id);
            return true;
        }

        return false;
    }

    public Student getStudent(int id) {
        StudentEntity studentEntity;
        try {
            studentEntity = studentRepo.findById(id)
                    .orElseThrow(() -> new RuntimeException("No student with this id"));

            return new Student(studentEntity.getId(), studentEntity.getName(), studentEntity.getEmail(), studentEntity.getAge());
        } catch (RuntimeException e) {
            return null;
        }
    }
}
