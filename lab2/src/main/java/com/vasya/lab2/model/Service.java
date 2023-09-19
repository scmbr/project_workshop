package com.vasya.lab2.model;

import jakarta.persistence.*;

import java.sql.Date;


@Entity
@Table(name="service")
public class Service {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_service;
    private Date date;
    private String name;

    private long id_request;

    public long getId_service() {
        return id_service;
    }

    public void setId_service(long id_service) {
        this.id_service = id_service;
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

    public long getId_request() {
        return id_request;
    }

    public void setId_request(long id_request) {
        this.id_request = id_request;
    }
}
