package org.example;
import java.util.ArrayList;
import java.util.List;

public abstract class Employe {
    private String nom;
    private List<Outil> mesOutils;

    public Employe(String nom) {
        this.nom = nom;
        this.mesOutils = new ArrayList<>();
    }

    public void ajouterOutil(Outil outil) {
        this.mesOutils.add(outil);
    }

    public String getNom() { return nom; }
    public List<Outil> getMesOutils() { return mesOutils; }


}