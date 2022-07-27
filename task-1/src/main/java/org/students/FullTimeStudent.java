package org.students;

import org.students.model.Student;
import org.students.model.StudentType;

public class FullTimeStudent extends Student {
    public FullTimeStudent(String id, String name, String surname) {
        super(id, name, surname);
        setType(StudentType.FULL_TIME);
    }
}
