package com.vasya.lab2.service;


import com.vasya.lab2.model.Request;

import java.util.List;

public interface RequestService {
    public Request addRequest(Request request);
    public Request getRequestById(long id);
    public List<Request> getRequests();
    public void deleteRequest(long id);
    public Request updateRequest(Request request);
}
