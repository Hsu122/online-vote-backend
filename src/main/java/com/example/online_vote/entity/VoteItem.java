package com.example.online_vote.entity;

import jakarta.persistence.*;

@Entity
public class VoteItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public VoteItem() {
    }
    public VoteItem(String name) {
        this.name = name;
    }

    public int getId() { 
        return id; 
    }
    public void setId(int id) { 
        this.id = id;
    }

    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name;
    }
}
