package org.students.model;

import org.deanery.Deanery;
import org.deanery.rooms.model.Room;
import org.execptions.WrongHoursException;
import org.execptions.WrongRoomException;

import java.text.SimpleDateFormat;

public class Student {

    private final String id;
    private final String name;
    private final String surname;

    private StudentType type;

    public Student(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public String getType() {
        return type.getType();
    }

    public void setType(StudentType type) {
        this.type = type;
    }

    public String serve(Room room, Integer hour) throws WrongRoomException, WrongHoursException {
        Deanery.visitDeanery(this, room, hour);
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss").format(new java.util.Date());

        String raport =
                        "--------------------------------------------------\n" +
                        String.format("%18s", "") + "STUDENT " + id + String.format("%18s", "") + "\n" +
                        "First Name  | " + name + "\n" +
                        "Second Name | " + surname + "\n" +
                        "Raport generated on " + timeStamp + "\n" +
                        "Room number: " + room.getId() + "\n" +
                        "--------------------------------------------------";
        return raport;
    }
}
