package org.mockData;

import org.deanery.rooms.FullTimeRoom;
import org.deanery.rooms.PartTimeRoom;
import org.deanery.rooms.model.Room;

import java.util.ArrayList;
import java.util.List;

public class mockRooms {
    public static List<Room> createRooms() {
        Room fullTime1 = new FullTimeRoom("A123", 8, 16);
        Room fullTime2 = new FullTimeRoom("B123", 9, 17);
        Room partTime1 = new PartTimeRoom("C124", 9, 13);
        Room partTime2 = new PartTimeRoom("D124", 17, 20);

        List<Room> listOfRooms = new ArrayList<>(List.of(fullTime1, fullTime2, partTime1, partTime2));
        return listOfRooms;
    }
}
