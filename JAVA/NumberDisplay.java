package org.example;

public class NumberDisplay {
    private int value;
    private int limit;

    public NumberDisplay(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public void increment() {
        value = (value + 1) % limit;
    }

    public void setValue(int newValue) {
        if (newValue >= 0 && newValue < limit) {
            this.value = newValue;
        }
    }

    public int getValue() {
        return value;
    }

    public String getDisplayValue() {
        // Formate l'entier sur 2 chiffres avec un zéro initial si nécessaire
        return String.format("%02d", value);
    }
}
