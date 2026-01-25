package org.example.controller;

import org.example.model.MoyenDeTransport;
import org.example.model.Voiture;
import org.example.model.Hélico;
import java.util.ArrayList;
import java.util.List;

public class TransportController {
    private List<MoyenDeTransport> controlList = new ArrayList<>();
    private MoyenDeTransport transportActuel = null;

    // 1. AJOUTER
    public void ajouterAuControl(MoyenDeTransport m) {
        this.controlList.add(m);
    }

    // 2. CHOISIR VOITURE
    public void choisirVoiture() {
        for (MoyenDeTransport m : controlList) {
            if (m instanceof Voiture) {
                this.transportActuel = m;
                System.out.println("SUCCÈS : " + m.getName() + " est maintenant le transport actuel.");
                return;
            }
        }
        System.out.println("ERREUR : Aucune voiture n'a été créée dans la liste !");
    }

    // 3. CHOISIR HELICO
    public void choisirHélico() {
        for (MoyenDeTransport m : controlList) {
            if (m instanceof Hélico) {
                this.transportActuel = m;
                System.out.println("SUCCÈS : " + m.getName() + " est maintenant le transport actuel.");
                return;
            }
        }
        System.out.println("ERREUR : Aucun hélicoptère n'a été créé dans la liste !");
    }

    // 4. VERIFIER le moyen choisi :)
    public void afficherSelection() {
        if (this.transportActuel != null) {
            System.out.println("Transport actuel : " + transportActuel.getName());
        } else {
            System.out.println("Aucun transport n'est sélectionné pour le moment.");
        }
    }
}