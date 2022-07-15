package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.games.blackjack.BlackjackGame;
import com.github.zipcodewilmington.casino.games.blackjack.BlackjackPlayer;
import com.github.zipcodewilmington.casino.games.card.Card;
import com.github.zipcodewilmington.casino.games.card.Hand;
import com.github.zipcodewilmington.casino.games.card.Shoe;
import com.github.zipcodewilmington.casino.games.card.deck.Deck;

import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        BlackjackGame blackjack = new BlackjackGame();
        BlackjackPlayer player = new BlackjackPlayer();
        BlackjackPlayer dealer = new BlackjackPlayer();
        Deck playingDeck = new Deck();
        Shoe shoe = new Shoe();
        List<Card> fullShoe = shoe.getAllCards();
        System.out.println(fullShoe.size());
//        blackjack.setBet();
        playingDeck.draw(dealer);
        playingDeck.draw(player);


        blackjack.betOption();


    }
}
