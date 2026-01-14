package org.example;

public class MainGarage {
    public static void main(String[] args) {

        // 1. Création du Garage
        Garage monGarage = new Garage();
        System.out.println("--- La baguette garage est ouvert ---");

        // 2. on cree des employés
        Employe Jacquie = new Employe("Jacquie");
        Employe Michelle = new Employe("Michelle");

        // 3. Outil au employes
        Jacquie.ajouterOutil(new Outil("Museauliere"));
        Michelle.ajouterOutil(new Outil("Harnet BDSM>"));

        // 4. On embauche les employés au garage
        monGarage.ajouterEmploye(Jacquie);
        monGarage.ajouterEmploye(Michelle);

        // 5. Création et ajout de pièces dans le garage sa grand mere
        monGarage.ajouterPiece(new Piece("Pneu Hiver", 150));
        monGarage.ajouterPiece(new Piece("Pare-brise", 300));

        // 6. AFFICHAGE et tests
        System.out.println("\n--- Liste des employés et leurs outils ---");
        for (Employe e : monGarage.getLesEmployes()) {
            System.out.println("Employé : " + e.getNom());
            System.out.println("   Outils : " + e.getMesOutils());
            // Java va utiliser la méthode toString() de Outil pour afficher les noms proprement
        }

        System.out.println("\n--- Stock des pièces créées ---");
        for (Piece p : monGarage.getLeStock()) {
            System.out.println("- " + p);
            // Java va utiliser la méthode toString() de Piece
        }
    }
}