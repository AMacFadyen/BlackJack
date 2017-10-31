package com.example.alex.cardgamelab;

/**
 * Created by Alex on 31/10/2017.
 */

public interface Playable {

    String twistOrStick();
    int getHandSize();
    Hand getHand();
    void addToHand(Card card);
    boolean isBust();
    boolean isStick();
    int getHandScore();
    String getName();
}
