package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Classes.Comment;
import Classes.Room;
import Classes.Topic;
import Classes.User;

@RestController
public class TopicController {
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){

        return Arrays.asList(
            new Topic("1", "js", "JS tutorial"),
            new Topic("1", "js", "JS tutorial"),
            new Topic("1", "js", "JS tutorial"),
            new Topic("1", "js", "JS tutorial"),
            new Topic("1", "js", "JS tutorial"),
            new Topic("1", "js", "JS tutorial")
        );
    }


    @RequestMapping("/room")
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
