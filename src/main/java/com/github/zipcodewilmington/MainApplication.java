package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.blackjack.BlackjackGame;
import com.github.zipcodewilmington.casino.games.card.Card;
import com.github.zipcodewilmington.casino.games.card.Shoe;
import com.github.zipcodewilmington.casino.games.card.deck.Deck;

import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
//        BlackjackGame blackjack = new BlackjackGame();
        Deck playingDeck = new Deck();
//        playingDeck.fullDeck();
//        System.out.println(playingDeck.toString());
//        playingDeck.shuffle();
//        playingDeck.draw();
        Shoe shoe = new Shoe();
        List<Card> fullShoe = shoe.getAllCards();
        System.out.println(fullShoe.size());



    }
}
