package com.vasya.lab6.controller;

public class AnswerLite {
    private String title;

    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String answerTitle) {
        this.title = answerTitle;
    }
}
