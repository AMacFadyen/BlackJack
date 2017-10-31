package com.example.alex.cardgamelab;

import java.util.ArrayList;

/**
 * Created by Alex on 31/10/2017.
 */

public class Hand {

    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }

    public int getHandSize(){
        return hand.size();
    }

    public void add(Card card){
        hand.add(card);
    }

    public int calcHandValue(){
        int initialTotal = 0;
        int finalTotal = 0;
        for(Card card: hand){
            int cardValue = card.getRankValue();
            initialTotal += cardValue;
            if (cardValue == 11 && initialTotal > 21){
                finalTotal += 1;
            }
            else finalTotal += cardValue;
        }
        return finalTotal;
    }

}
