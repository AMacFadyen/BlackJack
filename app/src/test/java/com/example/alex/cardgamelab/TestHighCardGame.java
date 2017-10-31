//package com.example.alex.cardgamelab;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.Mockito;
//
//import java.util.ArrayList;
//
//import static org.junit.Assert.assertEquals;
//
///**
// * Created by Alex on 26/10/2017.
// */
//
//public class TestHighCardGame {
//
//    Deck deck;
//    Player player1;
//    Player player2;
//    Player spyPlayer1;
//    Player spyPlayer2;
//    Game game;
//    Game testgame;
//
//
//    @Before
//    public void before(){
//        deck = new Deck();
//        player1 = new Player("Alex");
//        player2 = new Player("John");
//        spyPlayer1 = Mockito.spy(player1);
//        spyPlayer2 = Mockito.spy(player2);
//        ArrayList<Player> players = new ArrayList<Player>();
//        ArrayList<Player> testPlayers = new ArrayList<Player>();
//        players.add(player1);
//        players.add(player2);
//        testPlayers.add(spyPlayer1);
//        testPlayers.add(spyPlayer1);
//        game = new Game(players, deck);
//        testgame = new Game(testPlayers,deck);
//    }
//
//    @Test
//    public void testCardCount(){
//        assertEquals(52, deck.deck.size());
//    }
//
//    @Test
//    public void testGivePlayerCard(){
//        deck.shuffle();
//        deck.deal(player1);
//        assertEquals(1, player1.hand.size());
//    }
//
//    @Test
//    public void testCheckWinner(){
//        game.gameStart();
//        assertEquals(player1, game.checkWinner());
//    }
//
//    @Test
//    public void testForceWin(){
//        Mockito.when(spyPlayer1.getHand().get(0).getRank().getValue()).thenReturn(10);
//        Mockito.when(spyPlayer2.getHand().get(0).getRank().getValue()).thenReturn(8);
//        assertEquals();
//
//    }
//
//
//
//}
