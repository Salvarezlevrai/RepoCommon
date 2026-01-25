package org.example;
import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Employe> lesEmployes = new ArrayList<>();
    private List<Piece> leStock = new ArrayList<>();

    public void ajouterEmploye(Employe e) { lesEmployes.add(e); }
    public void ajouterPiece(Piece p) { leStock.add(p); }

    public void afficherEtatComplet() {
        System.out.println("\n--- LISTE DES EMPLOYÉS ET OUTILS ---");
        for (Employe e : lesEmployes) {
            System.out.print("Employé: " + e.getNom() + " | Outils: ");
            System.out.println(e.getMesOutils());
        }

        System.out.println("\n--- STOCK DES PIÈCES ---");
        for (Piece p : leStock) {
            System.out.println("- " + p);
        }
    }
}