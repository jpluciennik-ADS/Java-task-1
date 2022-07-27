package org.students;

import org.students.model.Student;
import org.students.model.StudentType;

public class PartTimeStudent extends Student {
    public PartTimeStudent(String id, String name, String surname) {
        super(id, name, surname);
        setType(StudentType.PART_TIME);
    }
}
