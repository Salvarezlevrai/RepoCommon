package org.example.test;
import org.example.model.Hélico;
import org.example.model.MoyenDeTransport;
import org.example.model.Voiture;
import org.example.controller.TransportController;
import java.util.Scanner;




public class Main {
    private static MoyenDeTransport monVehicule = null;

    public static void main(String[] args) {
        TransportController controller = new TransportController();
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("0:EXIT / 1: CREER VOITURE et nom/ 2: CREER HELICO et nom/ 3: CHOISIR VOITURE / 4: CHOISIR HELICO");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    String nomSaisi = scanner.nextLine();
                    monVehicule = new Voiture(nomSaisi);
                    controller.ajouterAuControl(monVehicule);
                    break;

                case 2:
                    String nomSaisi2 = scanner.nextLine();
                    monVehicule = new Hélico(nomSaisi2);
                    controller.ajouterAuControl(monVehicule);
                    break;
                case 3:
                    controller.choisirVoiture();
                    break;
                case 4:
                    controller.choisirHélico();
                    break;
                default:
                    System.out.println("erreur");
            }
        } while (choix != 0);
        System.out.println("Fin  du programme.");

    }
}