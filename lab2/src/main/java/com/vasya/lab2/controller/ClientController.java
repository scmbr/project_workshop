package com.vasya.lab2.controller;

import com.vasya.lab2.model.Client;
import com.vasya.lab2.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping("/client/add")
    public String addClient(@RequestBody Client client){
        clientService.addClient(client);
        return "Client Added Successfully..";
    }


    @RequestMapping("/client/{id}")
    public Client getClientById(@PathVariable("id") long id){
        return clientService.getClientById(id);
    }


    @RequestMapping("/clients")
    public List<Client> getClients(){
        return clientService.getClients();
    }


    @PutMapping("/client")
    public Client updateClient(@RequestBody Client client){
        return clientService.updateClient(client);
    }


    @DeleteMapping("/client/{id}")
    public String deleteClient(@PathVariable("id") long id){
        clientService.deleteClient(id);
        return "Client Deleted";
    }
}
