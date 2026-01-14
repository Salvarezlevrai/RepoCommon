package org.example;

import java.util.ArrayList;

public class Auction {
    private ArrayList<Lot> lots = new ArrayList<>();

    public void addLot(Lot lot) {
        // Validation : on vérifie si le paramètre est valide
        if (lot == null) {
            throw new IllegalArgumentException("lot cannot be null");
        }
        lots.add(lot);
    }

    public int countLots() {
        return lots.size();
    }
}