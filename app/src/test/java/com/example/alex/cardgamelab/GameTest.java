package com.example.alex.cardgamelab;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alex on 31/10/2017.
 */

public class GameTest {

    Game game;
    Player player1;
    Dealer dealer;
    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
        player1 = new Player("Dave");
        dealer = new Dealer("Jabba", deck);
        ArrayList<Playable> players = new ArrayList<>();
        players.add(player1);
        players.add(dealer);
        game = new Game(players, dealer);
    }

    @Test
    public void gameCanStart(){
        assertEquals(0, player1.getHandSize());
        assertEquals(0, dealer.getHandSize());
        assertEquals(52, deck.getDeckSize());

        game.gameStart();

        assertEquals(2, player1.getHandSize());
        assertEquals(2, dealer.getHandSize());
        assertEquals(48, deck.getDeckSize());
    }
}
