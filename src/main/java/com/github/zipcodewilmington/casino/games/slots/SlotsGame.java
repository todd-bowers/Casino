package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.CasinoAccountManager;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame extends CasinoAccountManager implements GameInterface {
    List<Integer> gambler = new ArrayList<>();
    public void checkMoney(){
        System.out.println(gambler.get(0));
    }

    @Override
    public void add(PlayerInterface player) {
        player.getArcadeAccount();
        Integer balance = player.getArcadeAccount().getBalance();
        System.out.println(balance);
//        gambler.add(player);
    }

    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public void run() {

    }

    @Override
    public void bet() {

    }

    @Override
    public void continueGambling() {

    }

    @Override
    public void lose() {

    }

    @Override
    public void outcome() {

    }

    @Override
    public void bonus() {

    }

    @Override
    public void enterGame() {

    }

    @Override
    public void kickout() {

    }

    @Override
    public void account() {

    }

    @Override
    public void moneyCheck() {

    }

    @Override
    public void music() {

    }
}
