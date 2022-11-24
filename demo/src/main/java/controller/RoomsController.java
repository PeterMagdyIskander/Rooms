package controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Classes.Comment;
import Classes.Room;
import Classes.User;

@RestController
public class RoomsController {

    @RequestMapping("/rooms")
    public List<Room> getAllRooms() {
        return Arrays.asList(
                new Room(
                        "homeboys",
                        Arrays.asList(new Comment("ba7eb 7ayaty", "123", "false", "bito", "123")),
                        Arrays.asList(new User("bito", "123456")),
                        "bito"),
                new Room(
                        "homeboys",
                        Arrays.asList(new Comment("ba7eb 7ayaty", "123", "false", "bito", "123")),
                        Arrays.asList(new User("bito", "123456")),
                        "bito"));
    }
}
