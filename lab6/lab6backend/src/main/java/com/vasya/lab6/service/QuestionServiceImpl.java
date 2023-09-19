package com.vasya.lab6.service;

import com.vasya.lab6.model.Question;
import com.vasya.lab6.repository.QuestionRepo;
import com.vasya.lab6.repository.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{

    @Autowired
    private QuestionRepo questionRepo;
    @Override
    public Question addQuestion(Question question) {
        return questionRepo.save(question);
    }

    @Override
    public Question getQuestionById(long id) {
        return questionRepo.findById(id).get();
    }

    @Override
    public List<Question> getQuestions() {
        return (List<Question>) questionRepo.findAll();
    }

    @Override
    public void deleteQuestion(long id) {
            questionRepo.deleteById(id);
    }

    @Override
    public Question updateQuestion(Question question) {
        return questionRepo.save(question);
    }
}
