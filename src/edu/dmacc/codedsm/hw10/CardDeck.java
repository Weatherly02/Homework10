package edu.dmacc.codedsm.hw10;

import java.util.Map;
import java.util.HashMap;
import java.util.*;
import java.util.ArrayList;

public class CardDeck {

    public static void main(String[] args) {
        Map<String, List> cards = new HashMap<String, List>();

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

        cards.put("Hearts", rank);
        cards.put("Diamonds", rank);
        cards.put("Spades", rank);
        cards.put("Clubs", rank);


        for (Map.Entry<String, List> entry : cards.entrySet()) {
            for (int b = 1; b <= 13; b++) {
                System.out.println(entry.getKey() + " - " + b);
            }

        }
    }
}






