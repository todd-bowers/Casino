package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.numberguess.NumberGuessGame;
import com.github.zipcodewilmington.casino.games.slots.*;

public class MainApplication {
    public static void main(String[] args) {
        new Casino().run();

//        new SlotsGame().add().checkMoney();

//        Deck<? extends Card> deck = new PokerDeck();
//
//        deck.getCards();




        NumberGuessGame game = new NumberGuessGame();

    }
}
