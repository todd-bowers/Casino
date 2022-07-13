package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.games.roulette.rouletteBall;

import java.util.Random;

public class MainApplication {
    public static void main(String[] args) {
//        rouletteBall results = new rouletteBall();
//
//        Random random = new Random();
//        int ballNumber = random.nextInt(2) + 1;
//        if (ballNumber == 2){
//            System.out.print("00");
//        } else
//            System.out.println(ballNumber);
        new Casino().run();
    }
}
