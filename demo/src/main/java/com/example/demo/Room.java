package com.example.demo;

import java.util.List;


public class Room {
    private String id;
    private List<Comment> comments;
    private List<User> users;
    private String roomCreatorId;

    
    public Room() {
    }

    public Room(String id, List<Comment> comments, List<User> users, String roomCreatorId) {
        this.id = id;
        this.comments = comments;
        this.users = users;
        this.roomCreatorId = roomCreatorId;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public List<Comment> getComments() {
        return comments;
    }
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }
    public String getRoomCreatorId() {
        return roomCreatorId;
    }
    public void setRoomCreatorId(String roomCreatorId) {
        this.roomCreatorId = roomCreatorId;
    }
    
}
