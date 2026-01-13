package org.example;

public class TicketMachine{
    private int price;
    private int balance;

    public TicketMachine(int Ticketprice) {
        this.price = Ticketprice;
        this.balance = 0;
    }

    int getPrice(){
        return price;

    }

    int getBalance(){
        return balance;
    }

    int refund(){
        int tempTOREFUND = balance;
        balance = 0;
        return tempTOREFUND;

    }

    // E 4 : Validation
    void insertMoney(int amount){
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Error: amount must be positive");
        }
    }

    void printTicket(){
        if (balance >= price){
            System.out.println("Ticket printed");
            balance -= price;
        }
        else{
            System.out.println("Not enough money");
        }


        if ( balance <= 0){
            System.out.println("amount must be positive");
        }
    }
}
