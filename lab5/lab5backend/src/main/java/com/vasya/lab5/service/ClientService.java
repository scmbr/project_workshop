package com.vasya.lab5.service;

import com.vasya.lab5.model.Client;

import java.util.List;

public interface ClientService {
    public Client addClient(Client client);
    public Client getClientById(long id);
    public List<Client> getClients();
    public void deleteClient(long id);
    public Client updateClient(Client client);
}
