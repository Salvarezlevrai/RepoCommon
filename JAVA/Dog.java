package org.example;

class Dog extends Animal implements RunnableAnimal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Dog " + getName() + " runs!");
    }
}