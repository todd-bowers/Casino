package com.github.zipcodewilmington.casino.games.blackjack;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.ArrayList;
import java.util.List;

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




