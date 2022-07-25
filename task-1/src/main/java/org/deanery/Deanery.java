package org.deanery;

import org.deanery.rooms.model.Room;
import org.students.model.Student;
import org.execptions.*;

public class Deanery {
    public static void visitDeanery(Student student, Room room, Integer visitHour) throws WrongRoomException, WrongHoursException {
        String wrongRoomMessage = "This student cannot enter this room";
        String wrongHoursMessage = "This room cannot be entered at this time";

        if (!student.getType().equals(room.getType())) {
            throw new WrongRoomException(wrongRoomMessage);
        } else if (visitHour < room.getOpeningHour() || visitHour > room.getClosingHour()) {
            throw new WrongHoursException(wrongHoursMessage);
        }
    }
}
