package com.vasya.lab6.controller;

import com.vasya.lab6.model.Answer;
import com.vasya.lab6.model.Question;
import com.vasya.lab6.model.Quiz;
import com.vasya.lab6.repository.AnswerRepo;
import com.vasya.lab6.repository.QuizRepo;
import com.vasya.lab6.service.AnswerService;
import com.vasya.lab6.service.QuestionService;
import com.vasya.lab6.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class QuestionController {

    @Autowired
    private QuestionService questionService;
    @Autowired
    private QuizRepo quizRepo;
    @Autowired
    private QuizService quizService;
    @Autowired
    private AnswerRepo answerRepo;
    @Autowired
    private AnswerService answerService;

    @PostMapping("/question/add")
    public String addQuestion(@RequestBody QuestionTitle questionTitle){
        Question question=new Question();
        String questTitle=questionTitle.getQuestionTitle();
        long id_quiz=0;
        List<Quiz> quizzes= quizService.getQuizzes();
        id_quiz=quizzes.get(quizzes.size()-1).getId_quiz();
        question.setId_quiz(id_quiz);
        question.setQuestionTitle(questTitle);


        questionService.addQuestion(question);
        return "Question Added Successfully..";

    }


    @RequestMapping("/question/{id}")
    public Question getQuestionById(@PathVariable("id") long id){
        return questionService.getQuestionById(id);
    }


    @RequestMapping("/questions")
    public List<Question> getQuestion(){
        return questionService.getQuestions();
    }


    @PutMapping("/question")
    public Question updateQuestion(@RequestBody Question question){
        return questionService.updateQuestion(question);
    }


    @DeleteMapping("/question/{id}")
    public String deleteQuestion(@PathVariable("id") long id){
        List<Answer> answers= answerService.getAnswers();
        for (Answer answer:
                answers) {
            if (answer.getId_question() == id) {
                answerRepo.deleteById(answer.getId_answer());
            }
        }
        questionService.deleteQuestion(id);
        return "Question Deleted";
    }

}
