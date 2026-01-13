package org.example;

import java.util.ArrayList;

class Main {

    static boolean isInRange(int value, int min, int max) {
        if (value >= min && value <= max) {
            return true;
        } else {
            return false;
        }
    }


    static boolean sameIntegerValue(Integer a, Integer b){

        if (a == null || b == null){
            return false;
        }

        int diff = a - b;

        if (diff == 0){
            return true;
        }

        else {
            return false;
        }
    }

    static int sumList(ArrayList<Integer> values) {
        if (values == null) {
            return 0;
        }

        int total = 0;

        for (Integer n : values) {
            if (n != null) {
                total += n;
            }
        }

        return total;
    }

    static String adultLabel(int age){
        String value = (age >= 18) ? "Majeur" : "Mineur";
        return value;
    }

    static  String gradeMessage(String grade){
        switch (grade){
            case "A" :
                return "Execellent";
            case "B" :
                return "Bien";
            case "C" :
                return "Correct";
            case "autre":
                return "inconnu";

        }
        return grade;
    }

    // --- TESTEUR DE METHODS()
    static void main(String[] args) {

        // --- Test Car ---
        Car voiture1 = new Car("red");
        Car voiture2 = new Car("blue");
        Car voiture3 = new Car("yellow");

        voiture1.accelerate(30);

        voiture2.accelerate(20);
        voiture2.brake(5);

        // Test du freinage "trop fort" (pour vérifier la correction)
        voiture2.brake(100);

        System.out.println(voiture1.describe());
        System.out.println(voiture2.describe()); // Doit afficher speed=0, pas négatif
        System.out.println(voiture3.describe());

        System.out.println("--- Ticket Machine ---");

        // --- Test TicketMachine ---
        TicketMachine ticket = new TicketMachine(20);

        ticket.insertMoney(500);
        ticket.printTicket(); // Imprime, reste 480

        System.out.println("Reste : " + ticket.getBalance());

        int change = ticket.refund(); // Récupère 480
        System.out.println("Remboursement : " + change);
        System.out.println("Solde final : " + ticket.getBalance()); // Doit être 0

        // --- Test Student ---

        Student student1 = new Student("AlainWelbec",6);
        Student student2 = new Student("ALesGateauCaYvas",7);

        student1.setName("NewNameuh");

        System.out.println("Student n°1 : " + student1.describe());
        System.out.println("Student n°2 : " + student2.describe());

        // --- Test Integer ---

        System.out.println(sameIntegerValue(null, 5));
        ArrayList<Integer> maListe = new ArrayList<>();
        maListe.add(10);
        maListe.add(null); // Le fameux null
        maListe.add(5);
        System.out.println(sumList(maListe));


        // Test is in range
        System.out.println( "isInRange :" +isInRange(0, 1, 10));
        System.out.println( "isInRange :"+isInRange(5, 1, 10));

        // Test maj vs min
        System.out.println(adultLabel(18));

        // Test GRade

        System.out.println(gradeMessage("A"));

    }
}

/*testeueeesamereh*/