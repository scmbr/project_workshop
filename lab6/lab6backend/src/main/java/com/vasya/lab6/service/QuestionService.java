package com.vasya.lab6.service;

import com.vasya.lab6.model.Question;

import java.util.List;

public interface QuestionService {
    public Question addQuestion(Question question);
    public Question getQuestionById(long id);
    public List<Question> getQuestions();
    public void deleteQuestion(long id);
    public Question updateQuestion(Question question);
}
