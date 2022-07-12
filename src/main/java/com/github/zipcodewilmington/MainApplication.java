package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.games.blackjack.BlackjackGame;
import com.github.zipcodewilmington.casino.games.card.deck.Deck;

public class MainApplication {
    public static void main(String[] args) {
//        new Casino().run();
        BlackjackGame blackjack = new BlackjackGame();
        Deck playingDeck = new Deck();
        playingDeck.shuffle();


        System.out.println("nothing");
    }
}
