package org.example;

import java.util.ArrayList;

class Fox implements Actor {
    private int hunger;

    public Fox(int hunger) {
        this.hunger = hunger;
    }

    @Override
    public void act(ArrayList<Actor> newActors) {
        if (isActive()) {
            this.hunger++;
        }
    }

    @Override
    public boolean isActive() {
        return hunger < 5;
    }
}
