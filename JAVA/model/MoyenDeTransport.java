package org.example.model;


public abstract class MoyenDeTransport {
    private String name;

    public MoyenDeTransport(String nom) {
        this.name = nom;
    }

    public String getName() {
        return name;
    }
}