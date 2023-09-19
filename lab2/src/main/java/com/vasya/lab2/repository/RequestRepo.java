package com.vasya.lab2.repository;


import com.vasya.lab2.model.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepo extends CrudRepository<Request, Long> {
}
