package com.vasya.lab2.model;
import jakarta.persistence.*;

@Entity
@Table(name="client")
public class Client {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_client;
    private String name;
    private String surname;

    public long getId_client() {
        return id_client;
    }

    public void setId_client(long id_client) {
        this.id_client = id_client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
