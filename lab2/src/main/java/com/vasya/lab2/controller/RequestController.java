package com.vasya.lab2.controller;

import com.vasya.lab2.model.Request;
import com.vasya.lab2.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RequestController {
    @Autowired
    private RequestService requestService;

    @PostMapping("/request/add")
    public String addRequest(@RequestBody Request request){
        requestService.addRequest(request);
        return "Request Added Successfully..";
    }


    @RequestMapping("/request/{id}")
    public Request getRequestById(@PathVariable("id") long id){
        return requestService.getRequestById(id);
    }


    @RequestMapping("/requests")
    public List<Request> getRequests(){
        return requestService.getRequests();
    }


    @PutMapping("/request")
    public Request updateRequest(@RequestBody Request request){
        return requestService.updateRequest(request);
    }


    @DeleteMapping("/request/{id}")
    public String deleteRequest(@PathVariable("id") long id){
        requestService.deleteRequest(id);
        return "Request Deleted";
    }
}
