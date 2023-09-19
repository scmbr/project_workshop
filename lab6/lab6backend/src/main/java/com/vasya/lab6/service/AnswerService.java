package com.vasya.lab6.service;

import com.vasya.lab6.model.Answer;

import java.util.List;
import java.util.Optional;

public interface AnswerService {
    public Answer addAnswer(Answer patient);
    public Answer getAnswerById(long id);
    public List<Answer> getAnswers();
    public void deleteAnswer(long id);
    public Answer updateAnswer(Answer answer);
}
