package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comment {
    @Id
    private String id;
    private String text;

    private String parentCommentId;//relation
    private String userId;//relation
    private String roomId;//relation
    

    
    public Comment() {
    }

    public Comment(String text, String id, String parentCommentId, String userId, String roomId) {
        this.id = id;
        this.text = text;
        
        this.parentCommentId = parentCommentId;//relation
        this.userId = userId;//relation
        this.roomId = roomId;//relation
    }
    
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getParentCommentId() {
        return parentCommentId;
    }
    public void setParentCommentId(String parentCommentId) {
        this.parentCommentId = parentCommentId;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getRoomId() {
        return roomId;
    }
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

}
