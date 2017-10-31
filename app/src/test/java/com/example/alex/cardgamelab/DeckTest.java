package com.example.alex.cardgamelab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alex on 31/10/2017.
 */

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void testCardCount(){
        assertEquals(52, deck.getDeckSize());
    }

    @Test
    public void testCanRemoveTopCard(){
        deck.removeTopCard();
        assertEquals(51, deck.getDeckSize());
    }
}
