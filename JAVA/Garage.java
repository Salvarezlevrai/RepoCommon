package org.example;
import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Employe> lesEmployes;
    private List<Piece> leStock;

    public Garage() {
        this.lesEmployes = new ArrayList<>();
        this.leStock = new ArrayList<>();
    }

    public void ajouterEmploye(Employe e) {
        this.lesEmployes.add(e);
    }

    public void ajouterPiece(Piece p) {
        this.leStock.add(p);
    }

    public List<Employe> getLesEmployes() {
        return lesEmployes;
    }

    public List<Piece> getLeStock() {
        return leStock;
    }
}