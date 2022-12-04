package com.example.demo;

import java.util.List;

public class CommentDTO {
    private String commentId;
    private String text;
    private String userId;
    private String roomId;
    private List<CommentDTO> replies;

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
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getCommentId() {
        return commentId;
    }
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }
    public String getRoomId() {
        return roomId;
    }
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
    
}
