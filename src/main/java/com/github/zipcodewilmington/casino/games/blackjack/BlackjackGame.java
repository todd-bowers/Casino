package com.github.zipcodewilmington.casino.games.blackjack;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.card.deck.Deck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackjackGame implements GameInterface {
    double minBet;
    double maxBet;
    double playerBet;

    int wins;
    int loss;
    int push;

    public BlackjackGame() {
        wins = 0;
        loss = 0;
        push = 0;
    }


    public static void main(String[] args){
        System.out.println("Welcome to Caeser's Blackjack table");
        Deck playingDeck = new Deck();
        playingDeck.shuffle();

        Deck dealerDeck = new Deck();

        Deck playerDeck = new Deck();

        Scanner userInput = new Scanner(System.in);

        while (playerMoney > 0){
            System.out.println("You have " + playerMoney + "how much would you like to bet?");
            double playerBet = UserInput.nextDouble();
            if(playerBet < playerMoney){
                System.out.println("You can't swindle me!");
                break;
            }
            playerDeck.draw(playingDeck);
            dealerDeck.draw(playingDeck);
            playerDeck.draw(playingDeck);
            dealerDeck.draw(playingDeck);
        }

}

    @Override
    public void add(PlayerInterface player) {

    }

    @Override
    public void remove(PlayerInterface player) {

    }

    public void  run(){
//        isrunning = true;
//
//        while(isRunning){
//            //something in this loop, could eventually set isRunning to false
//            //nextTurn()
//        }
//
        //finish UP Game methods
    }

            public String toString() {
                return null;
            }

        }




