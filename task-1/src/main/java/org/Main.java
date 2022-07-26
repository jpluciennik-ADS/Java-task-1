package org;

import org.deanery.rooms.model.Room;
import org.mockData.mockRooms;
import org.mockData.mockStudents;
import org.students.model.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = mockStudents.createStudents();
        List<Room> rooms = mockRooms.createRooms();

        students.forEach((i) -> rooms.forEach((j) -> {
            try {
                System.out.println(i.serve(j, 10) + "\n");
            } catch (Exception e) {
                System.out.println(e.getMessage() + "\n");
            }
        }));
    }
}

