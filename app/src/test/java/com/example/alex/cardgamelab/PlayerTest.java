package com.example.alex.cardgamelab;

import com.example.alex.cardgamelab.Enums.Rank;
import com.example.alex.cardgamelab.Enums.Suit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alex on 31/10/2017.
 */

public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player("Rodney");
    }

    @Test
    public void hasName(){
        assertEquals("Rodney", player.getName());
    }

    @Test
    public void handStartsEmpty(){
        assertEquals(0, player.getHandSize());
    }

    @Test
    public void canAddToHand(){
        player.addToHand(new Card(Rank.EIGHT, Suit.DIAMONDS));
        player.addToHand(new Card(Rank.JACK, Suit.DIAMONDS));
        assertEquals(2, player.getHandSize());
    }

    @Test
    public void canGetHandValue(){
        player.addToHand(new Card(Rank.EIGHT, Suit.DIAMONDS));
        player.addToHand(new Card(Rank.JACK, Suit.DIAMONDS));
        assertEquals(18, player.getHandScore());
    }

    @Test
    public void startsNotBust(){
        assertEquals(false, player.isBust());
    }

    @Test
    public void playerIsBust(){
        player.addToHand(new Card(Rank.EIGHT, Suit.DIAMONDS));
        player.addToHand(new Card(Rank.JACK, Suit.DIAMONDS));
        player.addToHand(new Card(Rank.JACK, Suit.HEARTS));
        assertEquals(true, player.isBust());
    }

//    OUT FOR MOCKITOS!!
//    @Test
//    public void playerCanTwist(){
//        player.addToHand(new Card(Rank.EIGHT, Suit.DIAMONDS));
//        player.addToHand(new Card(Rank.JACK, Suit.DIAMONDS));
//
//    }

}
