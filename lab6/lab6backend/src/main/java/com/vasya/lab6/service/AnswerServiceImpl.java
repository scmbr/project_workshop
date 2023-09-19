package com.vasya.lab6.service;

import com.vasya.lab6.model.Answer;
import com.vasya.lab6.repository.AnswerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswerServiceImpl implements AnswerService{

    @Autowired
    private AnswerRepo answerRepo;
    @Override
    public Answer addAnswer(Answer answer) {
        return answerRepo.save(answer);
    }

    @Override
    public Answer getAnswerById(long id) {
        return answerRepo.findById(id).get();
    }

    @Override
    public List<Answer> getAnswers() {
        return (List<Answer>) answerRepo.findAll();
    }

    @Override
    public void deleteAnswer(long id) {
        answerRepo.deleteById(id);
    }

    @Override
    public Answer updateAnswer(Answer answer) {
        return answerRepo.save(answer);
    }
}
