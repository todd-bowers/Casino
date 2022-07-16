package com.github.zipcodewilmington;


import com.github.zipcodewilmington.casino.games.roulette.RouletteBall;
import com.github.zipcodewilmington.casino.games.roulette.RouletteGame;
import com.github.zipcodewilmington.casino.games.war.WarGame;

import java.util.Random;

public class MainApplication {
    public static void main(String[] args) {
        new Casino().run();

    }
}
