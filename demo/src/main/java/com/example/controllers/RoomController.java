package com.example.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Comment;
import com.example.demo.Room;
import com.example.demo.User;

@RestController
public class RoomController {

    @RequestMapping("/room")
    public List<Room> getAllRooms() {
        return Arrays.asList(
                new Room(
                        "SEC",
                        Arrays.asList(new Comment("ba7eb 7ayaty", "123", "false", "bito", "123")),
                        Arrays.asList(new User("PeterISK", "1", Arrays.asList("HEC", "KDEC"), Arrays.asList("SEC"),
                                Arrays.asList("123", "12"))),
                        "1"));
    }
}
