package org.example;

public class Piece {

    private String nom;
    private int prix;

    // Constructeur
    public Piece(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public int getPrix() {
        return prix;
    }

    // ... tes attributs et constructeur sont au dessus ...

    @Override
    public String toString() {
        return this.nom + " - " + this.prix + "€"; // On affiche le nom et le prix
    }


}