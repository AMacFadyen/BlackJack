package com.example.alex.cardgamelab;

import org.junit.Before;
import org.junit.Test;

import static com.example.alex.cardgamelab.Enums.Rank.TWO;
import static com.example.alex.cardgamelab.Enums.Suit.CLUBS;
import static org.junit.Assert.assertEquals;

/**
 * Created by Alex on 26/10/2017.
 */

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(TWO, CLUBS);
    }

    @Test
    public void testCardRank() {
        assertEquals(TWO, card.getRank());
    }

    @Test
    public void testCardSuit(){
        assertEquals(CLUBS, card.getSuit());
    }

    @Test
    public void canGetRankValue(){
        assertEquals(2, card.getRankValue());
    }
}
