package com.vasya.lab2.repository;

import com.vasya.lab2.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends CrudRepository<Client, Long> {
}
