package org;

import org.deanery.rooms.model.Room;
import org.mockData.mockRooms;
import org.mockData.mockStudents;
import org.students.model.Student;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static void main(String[] args) {

        List<Student> students = mockStudents.createStudents();
        List<Room> rooms = mockRooms.createRooms();

        // Part 1
        students.forEach((student) -> rooms.forEach((room) -> {
            try {
                System.out.println(student.serve(room, 10) + "\n");
            } catch (Exception e) {
                System.out.println(e.getMessage() + "\n");
            }
        }));

        //Part 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the room number: ");
        String roomId = sc.next();
        System.out.println("Enter the hour: ");
        Integer hour = sc.nextInt();
        System.out.println("Enter the student ID");
        String studentId = sc.next();

        AtomicBoolean roomFlag = new AtomicBoolean(false);
        AtomicBoolean studentFlag = new AtomicBoolean(false);
        students.forEach(student -> rooms.forEach(room -> {
            if (studentId.equals(student.getId())) {
                studentFlag.set(true);
                if (roomId.equals(room.getId())) {
                    roomFlag.set(true);
                    try {
                        System.out.println(student.serve(room, hour) + "\n");
                    } catch (Exception e) {
                        System.out.println(e.getMessage() + "\n");
                    }
                }
            }
        }));
        if (!studentFlag.get() && !roomFlag.get()) {
            System.out.println("That student and room doesn't exist.");
        } else if (!studentFlag.get()) {
            System.out.println("That student doesn't exist.");
        } else if (!roomFlag.get()) {
            System.out.println("That room doesn't exist.");
        }
    }
}

