package org.experis.favoritefood;

import java.util.Arrays;

public class FavoriteFood {
    public static void main(String[] args) {
        // dichiaro ed inizializzo l'array con i cibi preferiti
        String[] favoriteFood = {"lasagna", "pizza", "fiorentina", "anguria", "tiramisù"};
        // stampo il mio array
        System.out.println(Arrays.toString(favoriteFood));
        // stampo la lunghezza dell'array
        System.out.println(favoriteFood.length);
        // stampo il primo cibo della lista
        System.out.println(favoriteFood[0]);
        // stampo l'ultimo cibo della lista
        System.out.println(favoriteFood[favoriteFood.length - 1]);
        // stampo il cibo che si trova a metà lista
        int halfIndex = favoriteFood.length / 2;
        System.out.println(favoriteFood[halfIndex]);
    }
}
