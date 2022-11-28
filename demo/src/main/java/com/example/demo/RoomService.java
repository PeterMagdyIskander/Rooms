package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RoomService {
    private List<Room> rooms = new ArrayList<Room>() {};

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
