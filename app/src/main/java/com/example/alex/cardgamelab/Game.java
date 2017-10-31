package com.example.alex.cardgamelab;


import java.util.ArrayList;

import static android.media.CamcorderProfile.get;

/**
 * Created by Alex on 26/10/2017.
 */

public class Game{

    ArrayList<Playable> players;
    Dealer dealer;
    int currentWinningHand;
    Playable winningPlayer;


    public Game(ArrayList<Playable> players, Dealer dealer) {
        this.players = players;
        this.dealer = dealer;
        this.currentWinningHand = 0;
    }

    public void gameStart(){

        dealer.shuffleDeck();
        for(Playable player : players) {
            while(player.getHandSize() < 2){
            dealer.deal(player);}
        }
    }

    public String checkWinner(){
        for (Playable player: players){
            if (player.getHandScore()>currentWinningHand && player.isBust()==false){
                currentWinningHand = player.getHandScore();
                winningPlayer = player;
            }
        }return "The winner with the highest hand is" + winningPlayer.getName();
    }


    public void play(){
        gameStart();
        for(Playable player: players){
            while (player.isStick() !=true && player.isBust() == false) {
                String response = player.twistOrStick();
                if (response == "twist") {
                    dealer.deal(player);
                }
            }
        }checkWinner();
    }


}
