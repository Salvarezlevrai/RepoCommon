package org.example;


import java.util.ArrayList;

interface Actor {
    void act(ArrayList<Actor> newActors);
    boolean isActive();
}
