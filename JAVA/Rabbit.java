package org.example;

import java.util.ArrayList;

class Rabbit implements Actor {
    private int energy;

    public Rabbit(int energy) {
        this.energy = energy;
    }

    @Override
    public void act(ArrayList<Actor> newActors) {
        if (isActive()) {
            this.energy--;
        }
    }

    @Override
    public boolean isActive() {
        return energy > 0;
    }
}
