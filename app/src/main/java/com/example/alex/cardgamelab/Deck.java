package com.example.alex.cardgamelab;

import com.example.alex.cardgamelab.Enums.Suit;
import com.example.alex.cardgamelab.Enums.Rank;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Alex on 26/10/2017.
 */

public class Deck {

    ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<Card>();
        createCards();
    }

    public void createCards(){
        for(Suit suit: Suit.values()){
            for(Rank num: Rank.values()){
                Card card = new Card(num, suit);
                deck.add(card);
            }
        }
    }

    public int getDeckSize(){
        return this.deck.size();
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public Card removeTopCard(){
        return deck.remove(0);
    }

}
