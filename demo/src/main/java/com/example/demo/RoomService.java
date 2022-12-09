package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRooms() {
        return (List<Room>) roomRepository.findAll();
    }

    public Room getRoom(String id) {
        return roomRepository.findById(id).get();
    }

    public void addRoom(Room room) {
        roomRepository.save(room);
    }

    public void deleteRoom(String id){
        roomRepository.deleteById(id);
    }
}
