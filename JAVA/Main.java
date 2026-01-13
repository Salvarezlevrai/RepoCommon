package org.example;

import java.util.*;


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

    //ex:14 : Court-circuit : éviter un crash
    public static boolean isNonEmpty(String s ){
        return s !=null && !s.isEmpty();
    }



    // ex15 : comparatif strings
    public static boolean sameText(String a, String b) {
        return Objects.equals(a, b);
    }
    //ex 16 : tableaux
    public  static int sumArray(int[] arr){
        int sum = 0;
        for (int t=0 ; t < arr.length ; t ++)
        {
            sum += arr[t];
        }
        return sum ;
    }

    //ex17 : trouver le minimum
    public static int max(int[] arr) {

        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = arr[0];
        for (int value : arr)  {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    //ex18:
    public static int[] reversed(int[] arr){
        if ( arr == null){
            return null;
        }
        int[] result;
        result = new int[arr.length];
        for ( int i=0; i < arr.length; i++){
            result[i] = arr[arr.length -1 -i];
        }
        return result;

    }
    //ex19:multiplication
    public static void Multi (int x){
        for (int i =0 ;i<=10; i++){
            System.out.println(x+"*" +i+ "=" +(x *i));
        }

    }
    //ex20: compter jusqu'à condition
    public  static int countTriesToGetSix(){
        Random random = new Random();
        int count = 0;
        int number = 0;

        while (number != 6){
            number = random.nextInt(6)+1;
        count++;
        }

    return count;
    }

    //ex21: liste de courses


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
        System.out.println("----ex10------");
        System.out.println(sameIntegerValue(null, 5));
        ArrayList<Integer> maListe = new ArrayList<>();
        maListe.add(10);
        maListe.add(null); // Le fameux null
        maListe.add(5);
        System.out.println(sumList(maListe));


        // Test is in range
        System.out.println("----ex11------");
        System.out.println( "isInRange :" +isInRange(0, 1, 10));
        System.out.println( "isInRange :"+isInRange(5, 1, 10));

        // Test maj vs min
        System.out.println("----ex12------");
        System.out.println(adultLabel(18));

        // Test GRade
        System.out.println("----ex13------");
        System.out.println(gradeMessage("A"));

        //ex14 Court-circuit : éviter un crash
        System.out.println("----ex14------");
        System.out.println(isNonEmpty(null));
        System.out.println(isNonEmpty(""));
        System.out.println(isNonEmpty("ok"));


        // ex15
        System.out.println("----ex15------");
        System.out.println(sameText("abc", "abc") == true ?"bon": "marche pas" );

        System.out.println(sameText(new String("abc"), "abc") == true ?"bon": "marche pas" );

        System.out.println(sameText(null, "abc") == false ?"bon": "marche pas");

        System.out.println(sameText(null, null) == true ?"bon": "marche pas" );

        // ex16 tableaux
        System.out.println("----ex16------");
        int[] numbers =  {1,2,3,4,5 };
        System.out.println(sumArray(numbers));
        // ex17 : minimum
        System.out.println("----ex17------");
        int[] tab1= {3,7,2};
        int[] tab2={};
        System.out.println(max(tab1));
        System.out.println(max(tab2));

        //ex18 : reverse
        System.out.println("----ex18------");
        int[] original= {1,2,3};
        int[] reversed= reversed(original);
        System.out.println(Arrays.toString(reversed));
        System.out.println(Arrays.toString(original));

        //ex:19: multiplication
        System.out.println("----ex19------");
        Multi(1);

        //ex:20 compter jusqu'à condition
        System.out.println("----ex20------");
        System.out.println(countTriesToGetSix());

        //ex:21 liste de courses
        System.out.println("----ex21------");
    }


}


