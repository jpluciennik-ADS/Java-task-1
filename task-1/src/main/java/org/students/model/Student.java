package org.students.model;

public class Student {

    private final String id;
    private String name;
    private String surname;

    private StudentType type;

    public Student(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public void setType(StudentType type) {
        this.type = type;
    }
}
