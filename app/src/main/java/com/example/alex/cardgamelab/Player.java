package com.example.alex.cardgamelab;

import java.util.Scanner;

/**
 * Created by Alex on 26/10/2017.
 */

public class Player implements Playable {
    private String name;
    private Hand hand;
    private boolean stick;
    private String response;
    private int handScore;

    public Player(String name){
        this.name = name;
        this.hand = new Hand();
        this.stick = false;
        this.response = "";
        this.handScore = hand.calcHandValue();
    }

    public String getName() {
        return name;
    }

    public void addToHand(Card card){
        hand.add(card);
    }

    public int getHandScore() {
        return this.handScore;
    }

    public Hand getHand() {
        return hand;
    }

    public int getHandSize(){
        return hand.getHandSize();
    }

    public boolean isBust(){
        return getHandScore() > 21;
    }

    public boolean isStick() {
        return stick;
    }

    public String twistOrStick(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Twist or Stick?");
        this.response = scan.next();
        if (response.toLowerCase() == "stick"){
            this.stick = true;
        }
        return this.response;
    }


}
