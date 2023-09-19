package com.vasya.lab5.repository;


import com.vasya.lab5.model.Service;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepo extends CrudRepository<Service, Long> {

}
