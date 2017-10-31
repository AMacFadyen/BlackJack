package com.example.alex.cardgamelab;

import com.example.alex.cardgamelab.Enums.Rank;
import com.example.alex.cardgamelab.Enums.Suit;

/**
 * Created by Alex on 26/10/2017.
 */

public class Card {

    private Rank cardRank;
    private Suit suit;

    public Card(Rank cardRank, Suit suit){
        this.cardRank = cardRank;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return cardRank;
    }

    public int getRankValue(){
        return cardRank.getValue();
    }


}
