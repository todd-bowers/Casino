package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.games.blackjack.BlackjackGame;

public class MainApplication {
    public static void main(String[] args) {
        RouletteGame game = new RouletteGame();
        game.run();
//        new Casino().run();

    }
}
