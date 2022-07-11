package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.games.blackjack.Cards;
import com.github.zipcodewilmington.casino.games.blackjack.blackjackGame;

public class MainApplication {
    public static void main(String[] args) {
//        new Casino().run();
        blackjackGame blackjack = new blackjackGame();
        System.out.println(Cards.Suit.DIAMOND);
    }
}
