package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {

    @Id
    private String id;
    private String name;

    public Users() {
    }

    public Users(String name, String id) {
        this.name = name;
        this.id = id;
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
}
