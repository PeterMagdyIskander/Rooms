package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RoomService {
    private List<Room> rooms = new ArrayList<Room>() {
        {
            add(new Room(
                    "SEC",
                    Arrays.asList(new Comment("ba7eb 7ayaty", "123", "false", "bito", "123")),
                    Arrays.asList(new User("PeterISK", "1", Arrays.asList("HEC", "KDEC"), Arrays.asList("SEC"),
                            Arrays.asList("123", "12"))),
                    "1"));
        }
    };

    public List<Room> getAllRooms() {
        return rooms;
    }

    public Room getRoom(String id) {
        return rooms.stream().filter(room -> room.getId().equals(id)).findFirst().get();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    //TODO : DELETE ROOM
}
