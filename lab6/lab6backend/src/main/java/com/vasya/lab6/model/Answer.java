package com.vasya.lab6.model;

import jakarta.persistence.*;

@Entity
@Table(name="answer")
public class Answer {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_answer;
    private String title;
    private boolean status;
    private long id_question;

    public long getId_answer() {
        return id_answer;
    }

    public void setId_answer(long id) {
        this.id_answer = id_answer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public long getId_question() {
        return id_question;
    }

    public void setId_question(long id_question) {
        this.id_question = id_question;
    }
}
