package org.example;

class Car{
    private String color;
    private int  speed;

    public Car(String color){
        this.color = color;
        this.speed = 0;
    }

    void accelerate(int delta){
        speed += delta;
    }

    void brake(int delta){
        if (speed - delta < 0) {
            speed = 0; // On s'arrête à 0
        }
        else {
            speed -= delta;
        }
    }

    String describe(){
        return "color = " + color + ", speed = " + speed;
    }
}



