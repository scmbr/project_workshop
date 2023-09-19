package com.vasya.lab2.service;

import com.vasya.lab2.model.Client;
import com.vasya.lab2.model.Request;
import com.vasya.lab2.repository.RequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService{
    @Autowired
    private RequestRepo requestRepo;
    @Override
    public Request addRequest(Request request) {
        return requestRepo.save(request);
    }

    @Override
    public Request getRequestById(long id) {
        return requestRepo.findById(id).get();
    }

    @Override
    public List<Request> getRequests() {
        return (List<Request>) requestRepo.findAll();
    }

    @Override
    public void deleteRequest(long id) {
        requestRepo.deleteById(id);
    }

    @Override
    public Request updateRequest(Request request) {
        return requestRepo.save(request);
    }
}
