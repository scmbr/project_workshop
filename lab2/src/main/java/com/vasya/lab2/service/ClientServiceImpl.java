package com.vasya.lab2.service;

import com.vasya.lab2.model.Client;

import java.util.List;

import com.vasya.lab2.repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepo clientRepo;
    @Override
    public Client addClient(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public Client getClientById(long id) {
        return clientRepo.findById(id).get();
    }

    @Override
    public List<Client> getClients() {
        return (List<Client>) clientRepo.findAll();
    }

    @Override
    public void deleteClient(long id) {
        clientRepo.deleteById(id);
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepo.save(client);
    }
}
