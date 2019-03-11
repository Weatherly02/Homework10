package edu.dmacc.codedsm.hw10;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class CardDeck {

    public static void main(String[] args) {
        Map<String, List> fullDeck = new HashMap<>();

        ArrayList<Integer> rank = new ArrayList<Integer>();
        rank.add(1);
        rank.add(2);
        rank.add(3);
        rank.add(4);
        rank.add(5);
        rank.add(6);
        rank.add(7);
        rank.add(8);
        rank.add(9);
        rank.add(10);
        rank.add(11);
        rank.add(12);
        rank.add(13);

        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        for (String suit : suits) {
            fullDeck.put(suit, rank);
        }
        for (Integer b = 1; b < 14; b++) {
            rank.add(b);
        }
        for (Map.Entry<String, List> suit : fullDeck.entrySet())
            for (Object Card : suit.getValue()) {
                System.out.println(suit.getKey() + " - " + Card);
            }
    }
}

