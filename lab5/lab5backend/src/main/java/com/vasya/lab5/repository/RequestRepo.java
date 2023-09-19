package com.vasya.lab5.repository;


import com.vasya.lab5.model.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepo extends CrudRepository<Request, Long> {
}
