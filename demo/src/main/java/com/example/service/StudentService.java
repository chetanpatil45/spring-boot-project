package com.example.service;


import com.example.entity.StudentEntity;
import com.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<StudentEntity> students = new ArrayList<>();
    private StudentEntity studentEntity;

    @Autowired
    public StudentService (StudentEntity student){
        studentEntity = student;
    }

    public void addStudent(Student student){
        studentEntity.setId(student.getId());
        studentEntity.setName(student.getName());
        studentEntity.setEmail(student.getEmail());
        studentEntity.setAge(student.getAge());

        students.add(studentEntity);
    }

    public List<StudentEntity> getStudents(){
        return students;
    }
}
