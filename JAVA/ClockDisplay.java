package org.example;

public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;

    public ClockDisplay() {
        // Composition : l'horloge crée ses propres composants
        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60);
    }

    public void timeTick() {
        minutes.increment();
        // Si les minutes reviennent à 0, on change d'heure
        if (minutes.getValue() == 0) {
            hours.increment();
        }
    }

    public String getTime() {
        return hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }
}
