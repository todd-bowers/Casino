package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.games.blackjack.BlackjackGame;

public class MainApplication {
    public static void main(String[] args) {
        BlackjackGame bjGame = new BlackjackGame();
//        BlackjackPlayer player = new BlackjackPlayer();
//        BlackjackPlayer dealer = new BlackjackPlayer();
//        Deck playingDeck = new Deck();
//        Shoe shoe = new Shoe();
//        List<Card> fullShoe = shoe.getAllCards();
//        System.out.println(fullShoe.size());
//
////        blackjack.setBet();
//        playingDeck.draw(Hand);
//        playingDeck.draw(player);
//
//
//
//        blackjack.betOption();

    bjGame.run();

    }
}
