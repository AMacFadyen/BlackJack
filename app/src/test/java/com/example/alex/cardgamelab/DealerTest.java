package com.example.alex.cardgamelab;

import com.example.alex.cardgamelab.Enums.Rank;
import com.example.alex.cardgamelab.Enums.Suit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alex on 31/10/2017.
 */

public class DealerTest {

    Player player;
    Dealer dealer;
    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
        player = new Player("Rodney");
        dealer = new Dealer("Rodrigo", deck);
    }

    @Test
    public void hasName(){
        assertEquals("Rodrigo", dealer.getName());
    }

    @Test
    public void handStartsEmpty(){
        assertEquals(0, dealer.getHandSize());
    }

    @Test
    public void canAddToHand(){
        dealer.addToHand(new Card(Rank.EIGHT, Suit.DIAMONDS));
        dealer.addToHand(new Card(Rank.JACK, Suit.DIAMONDS));
        assertEquals(2, dealer.getHandSize());
    }

    @Test
    public void canGetHandValue(){
        dealer.addToHand(new Card(Rank.EIGHT, Suit.DIAMONDS));
        dealer.addToHand(new Card(Rank.JACK, Suit.DIAMONDS));
        assertEquals(18, dealer.getHandScore());
    }

    @Test
    public void startsNotBust(){
        assertEquals(false, dealer.isBust());
    }

    @Test
    public void dealerIsBust(){
        dealer.addToHand(new Card(Rank.EIGHT, Suit.DIAMONDS));
        dealer.addToHand(new Card(Rank.JACK, Suit.DIAMONDS));
        dealer.addToHand(new Card(Rank.JACK, Suit.HEARTS));
        assertEquals(true, dealer.isBust());
    }

    @Test
    public void dealerAddToPlayerHand(){
        dealer.deal(player);
        assertEquals(1, player.getHandSize());
    }
}

