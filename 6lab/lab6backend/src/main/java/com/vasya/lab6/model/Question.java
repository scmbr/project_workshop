package com.vasya.lab6.model;


import jakarta.persistence.*;

@Entity
@Table(name="question")
public class Question {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_question;
    private String questionTitle;

    private long id_quiz;

    public long getId_question() {
        return id_question;
    }

    public void setId_question(long id_question) {
        this.id_question = id_question;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public long getId_quiz() {
        return id_quiz;
    }

    public void setId_quiz(long id_quiz) {
        this.id_quiz = id_quiz;
    }
}
