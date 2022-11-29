package com.example.demo;

import java.util.List;

public class CommentDTO {
    private String text;
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
    
}
