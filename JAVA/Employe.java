package org.example;
import java.util.ArrayList;
import java.util.List;

public class Employe {

    // 1. Attributs
    private String nom;
    private List<Outil> mesOutils; // L'employé possède une liste d'outils

    // 2. Constructeur
    public Employe(String nom) {
        this.nom = nom;
        // IMPORTANT : On prépare la boîte à outils (sinon elle est null)
        this.mesOutils = new ArrayList<>();
    }

    // 3. Ajouter un outil a un employe
    public void ajouterOutil(Outil outil) {
        this.mesOutils.add(outil);
    }

    // 4. Affichage des noms
    public String getNom() {
        return nom;
    }

    public List<Outil> getMesOutils() {
        return mesOutils;
    }
}