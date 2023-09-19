package com.vasya.lab6.model;

import jakarta.persistence.*;

@Entity
@Table(name="quiz")
public class Quiz {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_quiz;
    private String name;

    public long getId_quiz() {
        return id_quiz;
    }

    public void setId_quiz(long id_quiz) {
        this.id_quiz = id_quiz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
