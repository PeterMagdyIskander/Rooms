package com.example.demo;

import java.util.List;

// import javax.persistence.Entity;
// import javax.persistence.Id;

// @Entity
public class User {

    // @Id
    private String id;
    private String name;
    private List<String> roomsInIds;
    private List<String> roomsCreatedIds;
    private List<String> commentIds;




    public User() {
    }

    public User(String name, String id, List<String> roomsInIds, List<String> roomsCreatedIds,
            List<String> commentIds) {
                super();
        this.name = name;
        this.id = id;
        this.roomsInIds = roomsInIds;
        this.roomsCreatedIds = roomsCreatedIds;
        this.commentIds = commentIds;
    }

    public List<String> getRoomsInIds() {
        return roomsInIds;
    }

    public void setRoomsInIds(List<String> roomsInIds) {
        this.roomsInIds = roomsInIds;
    }

    public List<String> getRoomsCreatedIds() {
        return roomsCreatedIds;
    }

    public void setRoomsCreatedIds(List<String> roomsCreatedIds) {
        this.roomsCreatedIds = roomsCreatedIds;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public List<String> getCommentIds() {
        return commentIds;
    }

    public void setCommentIds(List<String> commentIds) {
        this.commentIds = commentIds;
    }
}
