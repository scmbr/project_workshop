package com.vasya.lab6.repository;

import com.vasya.lab6.model.Answer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepo extends CrudRepository<Answer, Long> {
}
