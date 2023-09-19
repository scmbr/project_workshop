package com.vasya.lab6.controller;

import com.vasya.lab6.model.Answer;
import com.vasya.lab6.model.Question;
import com.vasya.lab6.repository.QuestionRepo;
import com.vasya.lab6.service.AnswerService;
import com.vasya.lab6.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class AnswerController {

    @Autowired
    private AnswerService answerService;
    @Autowired
    private QuestionRepo questionRepo;
    @Autowired
    private QuestionService questionService;
    @PostMapping("/answer/add")
    public String addAnswer(@RequestBody AnswerLite answerLite){
        Answer answer=new Answer();
        String title=answerLite.getTitle();
        boolean status=answerLite.isStatus();
        long id_question=0;
        List<Question> questions= questionService.getQuestions();
        id_question=questions.get(questions.size()-1).getId_question()+1;

       answer.setId_question(id_question);
       answer.setTitle(title);
       answer.setStatus(status);
        answerService.addAnswer(answer);
        return "Answer Added Successfully..";

    }


    @RequestMapping("/answer/{id}")
    public Answer getAnswerById(@PathVariable("id") long id){
        return answerService.getAnswerById(id);
    }


    @RequestMapping("/answers")
    public List<Answer> getAnswers(){
        return answerService.getAnswers();
    }
    @RequestMapping("/curAnswers")
    public List<Answer> getCurAnswers(){
        List<Answer> answers=answerService.getAnswers();
        List<Answer> curAnswers=new ArrayList<Answer>();
        List<Question> questions=questionService.getQuestions();
        long id_question=0;
        id_question=questions.get(questions.size()-1).getId_question()+1;
        for (Answer answer:
             answers) {
            if(answer.getId_question()==id_question)
            {
                curAnswers.add(answer);
            }
        }
        return curAnswers;
    }

    @PutMapping("/answer")
    public Answer updateAnswer(@RequestBody Answer answer){
        return answerService.updateAnswer(answer);
    }


    @DeleteMapping("/answer/{id}")
    public String deleteAnswer(@PathVariable("id") long id){
        answerService.deleteAnswer(id);
        return "Answer Deleted";
    }

}
