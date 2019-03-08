package edu.dmacc.codedsm.hw10;

import java.util.ArrayList;

public class CardDeck {

    public static void main(String[] args) {
        int[] deck = new int[52];

        ArrayList<String> suits = new ArrayList<>();
        suits.add("Hearts");
        suits.add("Diamands");
        suits.add("Spades");
        suits.add("Clubs");

        ArrayList<Integer> value = new ArrayList<>();
        value.add(1);
        value.add(2);
        value.add(3);
        value.add(4);
        value.add(5);
        value.add(6);
        value.add(7);
        value.add(8);
        value.add(9);
        value.add(11);
        value.add(12);
        value.add(13);

        for (String suit : suits) {
            for (Integer integer : value) {
                System.out.println("Suit " + suit + " - " + "Value " + integer);
            }

        }
    }
}
