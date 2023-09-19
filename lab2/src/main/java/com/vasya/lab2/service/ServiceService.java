package com.vasya.lab2.service;

import com.vasya.lab2.model.Client;
import com.vasya.lab2.model.Service;

import java.util.List;

public interface ServiceService {
    public Service addService(Service service);
    public Service getServiceById(long id);
    public List<Service> getServices();
    public void deleteService(long id);
    public Service updateService(Service service);
}
