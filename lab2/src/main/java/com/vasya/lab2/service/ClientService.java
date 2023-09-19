package com.vasya.lab2.service;

import com.vasya.lab2.model.Client;

import java.util.List;

public interface ClientService {
    public Client addClient(Client client);
    public Client getClientById(long id);
    public List<Client> getClients();
    public void deleteClient(long id);
    public Client updateClient(Client client);
}
