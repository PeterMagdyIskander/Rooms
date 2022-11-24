package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Classes.Topic;

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
}
