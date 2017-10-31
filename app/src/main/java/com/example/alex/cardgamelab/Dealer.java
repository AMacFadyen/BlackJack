package com.example.alex.cardgamelab;

/**
 * Created by Alex on 31/10/2017.
 */

public class Dealer extends Player {

    private Deck deck;

    public Dealer(String name, Deck deck) {
        super(name);
        this.deck = deck;
    }


    public void shuffleDeck(){
        deck.shuffle();
    }


    public void deal(Playable player){
        player.addToHand(deck.removeTopCard());
    }
    //move deal function to Dealer class but will be initiated by the game class//


}
