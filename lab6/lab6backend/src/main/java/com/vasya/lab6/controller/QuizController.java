package com.vasya.lab6.controller;


import com.vasya.lab6.model.Answer;
import com.vasya.lab6.model.Question;
import com.vasya.lab6.model.Quiz;
import com.vasya.lab6.repository.QuestionRepo;
import com.vasya.lab6.repository.AnswerRepo;
import com.vasya.lab6.repository.QuizRepo;
import com.vasya.lab6.service.AnswerService;
import com.vasya.lab6.service.QuestionService;
import com.vasya.lab6.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class QuizController {
    @Autowired
    private QuizService quizService;
    @Autowired
    private QuestionRepo questionRepo;
    @Autowired
    private AnswerRepo answerRepo;
    @Autowired
    private AnswerService answerService;
    @Autowired
    private QuestionService questionService;
    @Autowired
    private QuizRepo quizRepo;
    @PostMapping("/quiz/add")
    public String addQuiz(@RequestBody Quiz quiz){
        quizService.addQuiz(quiz);
        return "Quiz Added Successfully..";
    }


    @RequestMapping("/quiz/{id}")
    public Quiz getQuizById(@PathVariable("id") long id){
        return quizService.getQuizById(id);
    }
    @RequestMapping("/quiz/{id}/questions")
    public List<Question> getQuizQuestions(@PathVariable("id") long id){
        List<Question> questions=questionService.getQuestions();
        List<Question> Rquestions = new ArrayList<Question>();

        for (Question question:
             questions) {
            if(question.getId_quiz()==id)
            {
                Rquestions.add(question);
            }
        }
        return Rquestions;
    }


    @RequestMapping("/quizzes")
    public List<Quiz> getQuizzes(){
        return quizService.getQuizzes();
    }


    @PutMapping("/quiz")
    public Quiz updateQuiz(@RequestBody Quiz quiz){
        return quizService.updateQuiz(quiz);
    }


    @DeleteMapping("/quiz/{id}")
    public String deleteQuiz(@PathVariable("id") long id){

        List<Question> questions=questionService.getQuestions();
        List<Question> Rquestions = new ArrayList<Question>();
        List<Answer> answers=answerService.getAnswers();
        List<Answer> Ranswers=new ArrayList<Answer>();
        for (Question question:
                questions) {
            if(question.getId_quiz()==id)
            {
                for (Answer answer:
                     answers) {
                    if(answer.getId_question()==question.getId_question())
                    {
                        answerRepo.deleteById(answer.getId_answer());
                    }
                }
                questionRepo.deleteById(question.getId_question());
            }
        }

        quizService.deleteQuiz(id);
        return "Quiz Deleted";
    }

}
