package org.experis.ticket;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        // dichiaro ed inizializzo lo scanner
        Scanner scan = new Scanner(System.in);

        // dichiaro le variabili
        int userAge, kmTravel;
        double ticketPrice, overDiscount, underDiscount, priceForKm = 0.21;

        // chiedo all'utente quanti anni ha
        System.out.print("How old are you? ");
        userAge = scan.nextInt();
        //chiedo all'utente quanti km deve percorrere
        System.out.print("How many km do you have to travel? ");
        kmTravel = scan.nextInt();

        // calcolo il prezzo standard del biglietto
        ticketPrice = priceForKm * kmTravel;

        //calcolo gli sconti da applicare
        if (userAge < 18) {
            underDiscount = ticketPrice/100 * 20;
            ticketPrice = ticketPrice - underDiscount;
            //stampo il prezzo del biglietto scontato del 20% per i minorenni
            System.out.println("your ticket is priced: " + ticketPrice);
        } else if (userAge > 65) {
            overDiscount = ticketPrice/100 * 40;
            ticketPrice = ticketPrice - overDiscount;
            //stampo il prezzo del biglietto scontato del 40% per gli over65
            System.out.println("your ticket is priced: " + ticketPrice);
        } else {
            //stampo il prezzo del biglietto standard
            System.out.println("your ticket is priced: " + ticketPrice);
        }


        scan.close();
    }
}
