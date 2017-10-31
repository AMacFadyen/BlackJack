package com.example.alex.cardgamelab;

import com.example.alex.cardgamelab.Enums.Rank;
import com.example.alex.cardgamelab.Enums.Suit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alex on 31/10/2017.
 */

public class HandTest {

    Hand hand;

    @Before
    public void before(){
        hand = new Hand();
        hand.add(new Card(Rank.EIGHT, Suit.DIAMONDS));
        hand.add(new Card(Rank.JACK, Suit.DIAMONDS));
    }

    @Test
    public void canAddToHand(){
        hand.add(new Card(Rank.TWO, Suit.SPADES));
        assertEquals(3, hand.getHandSize());
    }

    @Test
    public void canCalculateHandValue(){
        assertEquals(18, hand.calcHandValue());
    }

    @Test
    public void AceCanBeOneAndEleven(){
        hand.add(new Card(Rank.ACE, Suit.SPADES));
        assertEquals(19, hand.calcHandValue());
    }

    @Test
    public void handCanBeMoreThanTwentyOne(){
        hand.add(new Card(Rank.SIX, Suit.SPADES));
        assertEquals(24, hand.calcHandValue());
    }

}
