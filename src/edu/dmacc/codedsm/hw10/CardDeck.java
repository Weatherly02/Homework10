package edu.dmacc.codedsm.hw10;

import java.util.*;

public class CardDeck {

    public static void main(String[] args) {
        Map<Object, String> suits = new HashMap<Object, String>();
        Map<String, List<Integer>> rankValue = new HashMap<String, List<Integer>>();

        suits.put(0, "Hearts");
        suits.put(1, "Diamands");
        suits.put(2, "Spades");
        suits.put(3, "Clubs");

        List<Integer> rank = new ArrayList<Integer>();
        rank.add(1);
        rank.add(2);
        rank.add(3);
        rank.add(4);
        rank.add(5);
        rank.add(6);
        rank.add(7);
        rank.add(8);
        rank.add(9);
        rank.add(11);
        rank.add(12);
        rank.add(13);

        //rankValue.put("int list", rank);  // shows [1,2,3...13]
        //System.out.println(rank.get(8));  // shows 9

        //rank = rankValue.get("int list");
        //System.out.println(rank);

        System.out.println(suits);
        //System.out.println(suits.get(2));  //shows Spades

        // for (suits : suits) {
        for (int i = 0; i < rank.size(); i++) {
            //System.out.println(i);
            // System.out.println(i + "value" + String.valueOf(rank.get(i)));

            System.out.println(String.valueOf(rank.get(i)));

            for (int b = 0; b < 4; b++) {
                System.out.println(String.valueOf(suits.get(b)));


                //for (String suit : suit.get(b)) {
                //  for (Integer integer : rank) {
                //System.out.println("Suit " + getsuit + " - " + "Value " + integer);
            }

        }

    }
}

