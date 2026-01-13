package com.example.service;


import com.example.entity.StudentEntity;
import com.example.model.Student;
import com.example.repository.StudentRepo;
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
    public StudentService ( StudentRepo studentRepo){
        this.studentRepo = studentRepo;
    }

    public void addStudent(Student student){
        studentEntity.setId(student.getId());
        studentEntity.setName(student.getName());
        studentEntity.setEmail(student.getEmail());
        studentEntity.setAge(student.getAge());

        studentRepo.save(studentEntity);

//        students.add(studentEntity);
    }

    public List<StudentEntity> getStudents(){
//        return students;

        return studentRepo.findAll();
    }
}
