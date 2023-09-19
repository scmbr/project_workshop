package com.vasya.lab2.controller;

import com.vasya.lab2.model.Request;
import com.vasya.lab2.model.Service;
import com.vasya.lab2.service.RequestService;
import com.vasya.lab2.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServiceController {
    @Autowired
    private ServiceService serviceService;

    @PostMapping("/service/add")
    public String addService(@RequestBody Service service){
        serviceService.addService(service);
        return "Service Added Successfully..";
    }


    @RequestMapping("/service/{id}")
    public Service getServiceById(@PathVariable("id") long id){
        return serviceService.getServiceById(id);
    }


    @RequestMapping("/services")
    public List<Service> getServices(){
        return serviceService.getServices();
    }


    @PutMapping("/service")
    public Service updateService(@RequestBody Service service){
        return serviceService.updateService(service);
    }


    @DeleteMapping("/service/{id}")
    public String deleteService(@PathVariable("id") long id){
        serviceService.deleteService(id);
        return "Service Deleted";
    }
}
