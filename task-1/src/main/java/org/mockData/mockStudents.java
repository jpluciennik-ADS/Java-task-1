package org.mockData;

import org.students.FullTimeStudent;
import org.students.PartTimeStudent;
import org.students.model.Student;

import java.util.ArrayList;
import java.util.List;

public class mockStudents {
    public static List<Student> createStudents() {
        Student fullTime1 = new FullTimeStudent("27014", "Andrzej", "Krasiecki");
        Student fullTime2 = new FullTimeStudent("20901", "Martyna", "Podgorska");
        Student parTime1 = new PartTimeStudent("26665", "Aleksandra", "Kruk");
        Student parTime2 = new PartTimeStudent("28804", "Krzysztof", "Pietrzykowski");

        return new ArrayList<>(List.of(fullTime1, fullTime2, parTime1, parTime2));
    }
}
