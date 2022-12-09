package com.example.demo;

import java.util.List;

public class CommentDTO {
    private String text;
    private String userName;
    private String roomId;
    private List<CommentDTO> replies;
    private Long id;

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    
    public List<CommentDTO> getReplies() {
        return replies;
    }
    public void setReplies(List<CommentDTO> replies) {
        this.replies = replies;
    }
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getRoomId() {
        return roomId;
    }
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    
}
