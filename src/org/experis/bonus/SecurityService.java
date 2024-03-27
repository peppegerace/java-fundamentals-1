package org.experis.bonus;

import java.util.Arrays;
import java.util.Scanner;

public class SecurityService {
    public static void main(String[] args) {
        // creo l'array
        String[] guestList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
//        System.out.println(Arrays.toString(guestList));

        //creo lo scanner per l'input dell'utente
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String insertGuest = scan.nextLine();

        // rimuovo spazi e converto tutto in minuscolo il nome inserito
        insertGuest = insertGuest.trim().toLowerCase();

        // verifivo che il nome inserito è presente nella lista invitati
        boolean presentInTheList = false;
        for (String guest : guestList) {
            if (guest.trim().toLowerCase().equals(insertGuest)) {
                presentInTheList = true;
                break;
            }
        }

        //stampo il risultato
        System.out.println(presentInTheList ? "Sei in lista, benvenuto!" : "Mi dispiace, non sei in lista.");
    }
}
