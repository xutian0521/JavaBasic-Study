package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name= "user")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Name;

    public int getId() {
        return  Id;
    }
    public void setId(int id) {
        this.Id= id;
    }

    public String getName() {
        return Name;
    }
    public void setUser(String name) {
        this.Name = name;
    }
}
