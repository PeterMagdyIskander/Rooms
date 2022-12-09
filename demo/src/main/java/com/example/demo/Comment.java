package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String text;

    @ManyToOne
    private Users user;//MANY comments have ONE user

    @ManyToOne
    private Room room;//MANY comments have ONE room

    @ManyToOne
    private Comment comment;//MANY comments (replies) have ONE comment

    public Comment() {
    }
    public Comment(Long id) {
        this.id=id;
    }
    public Comment(String text) {
        this.text = text;
    }
    
    public Comment(String text, Users user, Room room, Comment comment) {
        this.text = text;
        this.user = user;
        this.room = room;
        this.comment = comment;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Users getUser() {
        return user;
    }
    public void setUser(Users user) {
        this.user = user;
    }
    public Room getRoom() {
        return room;
    }
    public void setRoom(Room room) {
        this.room = room;
    }
    public Comment getComment() {
        return comment;
    }
    public void setComment(Comment comment) {
        this.comment = comment;
    }

    
}
