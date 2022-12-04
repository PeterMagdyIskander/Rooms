package com.example.demo;

import java.util.List;

public class RoomDTO {
    private String id;
    private List<CommentDTO> comments;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public List<CommentDTO> getComments() {
        return comments;
    }
    public void setComments(List<CommentDTO> comments) {
        this.comments = comments;
    }

}
