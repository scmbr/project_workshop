package com.vasya.lab5.repository;

import com.vasya.lab5.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends CrudRepository<Client, Long> {
}
