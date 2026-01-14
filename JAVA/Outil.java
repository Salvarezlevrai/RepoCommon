package org.example;

public class Outil {
    private String nom;

    public Outil(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return this.nom; // On dit à Java : "Quand on t'affiche, montre juste le nom"
    }

}