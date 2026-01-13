package com.example.entity;

public class CourseEntity {
    private int id;
    private String name;
    private int fees;

    public CourseEntity(){}

    public CourseEntity(int id, String name, int fees) {
        this.id = id;
        this.name = name;
        this.fees = fees;
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

    @Override
    public String toString() {
        return "CourseEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fees=" + fees +
                '}';
    }
}
