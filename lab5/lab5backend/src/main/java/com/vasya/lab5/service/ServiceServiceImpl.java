package com.vasya.lab5.service;



import com.vasya.lab5.model.Service;
import com.vasya.lab5.repository.ServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService{

    @Autowired
    private ServiceRepo serviceRepo;
    @Override
    public Service addService(Service service) {
        return serviceRepo.save(service);
    }

    @Override
    public Service getServiceById(long id) {
        return serviceRepo.findById(id).get();
    }

    @Override
    public List<Service> getServices() {
        return (List<Service>) serviceRepo.findAll();
    }

    @Override
    public void deleteService(long id) {
        serviceRepo.deleteById(id);
    }

    @Override
    public Service updateService(Service service) {
        return serviceRepo.save(service);
    }
}
