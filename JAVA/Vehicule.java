package org.example;
//EX26/27
class Vehicule {
    protected int speed;

    public Vehicule(int initialSpeed) {
        if (initialSpeed < 0){
            this.speed = 0;
        }
        else {
            this.speed = initialSpeed  ;
        }

    }

    public void accelerate2(int delta) {
        speed += delta;
    }

    public  int getSpeed2() {
        return speed;
    }
}



