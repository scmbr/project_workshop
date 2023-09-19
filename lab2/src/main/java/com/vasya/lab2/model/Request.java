package com.vasya.lab2.model;


import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="request")
public class Request {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_request;
    private Date date;
    private String name;

    private long id_client;

    public long getId_request() {
        return id_request;
    }

    public void setId_request(long id_request) {
        this.id_request = id_request;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId_client() {
        return id_client;
    }

    public void setId_client(long id_client) {
        this.id_client = id_client;
    }
}
