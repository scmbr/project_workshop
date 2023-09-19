package com.vasya.lab6.service;

import com.vasya.lab6.model.Quiz;

import java.util.List;

public interface QuizService {
    public Quiz addQuiz(Quiz quiz);
    public Quiz getQuizById(long id);
    public List<Quiz> getQuizzes();
    public void deleteQuiz(long id);
    public Quiz updateQuiz(Quiz quiz);
}
