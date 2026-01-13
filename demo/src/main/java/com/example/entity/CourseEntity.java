package com.example.entity;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "courseinfo")
public class CourseEntity {
    @Id
    private int id;


    private String name;
    private int fees;
    private int duration;

    public CourseEntity(){}

    public CourseEntity(int id, String name, int fees, int duration) {
        this.id = id;
        this.name = name;
        this.fees = fees;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "CourseEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fees=" + fees +
                ", duration=" + duration +
                '}';
    }
}
