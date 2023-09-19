package com.vasya.lab6.service;




import com.vasya.lab6.model.Quiz;
import com.vasya.lab6.repository.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService{

    @Autowired
    private QuizRepo quizRepo;
    @Override
    public Quiz addQuiz(Quiz quiz) {
        return quizRepo.save(quiz);
    }

    @Override
    public Quiz getQuizById(long id) {
        return quizRepo.findById(id).get();
    }

    @Override
    public List<Quiz> getQuizzes() {
        return (List<Quiz>) quizRepo.findAll();
    }

    @Override
    public void deleteQuiz(long id) {
        quizRepo.deleteById(id);
    }

    @Override
    public Quiz updateQuiz(Quiz quiz) {
        return quizRepo.save(quiz);
    }
}
