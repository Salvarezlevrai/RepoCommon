package org.example;

public class MainGarage {
    public static void main(String[] args) {
        Garage monGarage = new Garage();

        // Création via la classe concrète Mécanicien
        Employe jacquie = new Mécanicien("Nolan");
        Employe michelle = new Mécanicien("Raphael");
        Employe bonnie = new Mécanicien("Thomas");

        // Distribution des outils
        jacquie.ajouterOutil(new Outil("cigarette électronique"));
        michelle.ajouterOutil(new Outil("lasseau"));
        bonnie.ajouterOutil(new Outil("lunettes de précision"));

        // Embauche
        monGarage.ajouterEmploye(jacquie);
        monGarage.ajouterEmploye(michelle);
        monGarage.ajouterEmploye(bonnie);

        // Production de pièces
        monGarage.ajouterPiece(new Piece("Pneu en plastique", 150));
        monGarage.ajouterPiece(new Piece("Pneu TKT ", 300));
        monGarage.ajouterPiece(new Piece("Pneu explosifs ", 500));
        

        // Affichage
        monGarage.afficherEtatComplet();
    }
}