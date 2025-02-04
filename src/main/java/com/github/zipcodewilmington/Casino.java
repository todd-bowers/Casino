package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.CasinoAccountManager;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.PracticeGamesAndPlayerClasses.*;
import com.github.zipcodewilmington.casino.games.blackjack.BlackjackGame;
import com.github.zipcodewilmington.casino.games.blackjack.BlackjackPlayer;
import com.github.zipcodewilmington.casino.games.numberguess.NumberGuessGame;
import com.github.zipcodewilmington.casino.games.numberguess.NumberGuessPlayer;
import com.github.zipcodewilmington.casino.games.roulette.RouletteGame;
import com.github.zipcodewilmington.casino.games.roulette.RoulettePlayer;
import com.github.zipcodewilmington.casino.games.slots.SlotsGame;
import com.github.zipcodewilmington.casino.games.slots.SlotsPlayer;
import com.github.zipcodewilmington.casino.games.war.WarGame;
import com.github.zipcodewilmington.casino.games.war.WarGamePlayer;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 7/21/2020.
 */
public class Casino extends CasinoAccountManager implements Runnable {

    private final IOConsole console = new IOConsole(AnsiColor.BLUE);
    CasinoAccountManager casinoAccountManager = new CasinoAccountManager();
    private String name;
    private Integer balance;
    List<PlayerInterface> casinoList = new ArrayList<>();
    boolean quit = true;
    CasinoAccount casinoAccount;

    public Casino(PlayerInterface player) {
        this.casinoList.add(player);

        //        runNewAccount(player);
    }

    public Casino() {

    }

    public void runNewAccount(PlayerInterface player){
        while(quit) {
            startGameReal();
//            this.startGame();
//            this.startGamePart1();
        }
    }

    @Override
    public void run() {
//        if(getArcadeDashboardInput().equalsIgnoreCase("login")){
//
//        }
        if(!this.casinoList.isEmpty()){
            reRunGame(this.casinoList.get(0).getArcadeAccount());
        }
        while(quit) {
            startGameReal();
//            this.startGame();
//            this.startGamePart1();
        }
    }


    public void readWriterFile() {

    }
    private String getArcadeDashboardInput() {
        return console.getStringInput("Welcome to the Arcade Dashboard!" +
                "\nFrom here, you can select any of the following options:" +
                "\n\t[ create-account ], [ select-game ], [login/logout]");
    }

    private String getGameSelectionInput() {
        return console.getStringInput(new StringBuilder()
                .append("Welcome to the Game Selection Dashboard!")
                .append("\nFrom here, you can select any of the following options:")
                .append("\n\t[ SLOTS ], [ NUMBERGUESS ], [ BLACKJACK ], [ ROULETTE ],[ WAR ]")
                .toString());
    }

    public void reRunGame(CasinoAccount casinoAccount) {
        this.casinoAccount = this.casinoList.get(0).getArcadeAccount();

            String gameInput = getArcadeDashboardInput();
            if(gameInput.equalsIgnoreCase("create-account")){
                String accountName = console.getStringInput("Enter a name for your account:");
                String accountPassword = console.getStringInput("Enter a password for your account");
                Integer accountBalance = console.getIntegerInput("Enter how much you want to deposit into your account");

                this.casinoAccount = casinoAccountManager.createAccount(accountName, accountPassword, accountBalance);
            } else if (gameInput.equalsIgnoreCase("select-game")) {
                String gameSelection = getGameSelectionInput();
                if (gameSelection.equalsIgnoreCase("SLOTS")) {
                    this.play(new SlotsGame(), new SlotsPlayer(this.casinoAccount));
                } else if (gameSelection.equalsIgnoreCase("BLACKJACK")) {
//                            this.play(new BlackjackGame(), new BlackjackPlayer(casinoAccount));
                } else if (gameSelection.equalsIgnoreCase("ROULETTE")) {
                    this.play(new RouletteGame(), new RoulettePlayer(this.casinoAccount));
                } else if (gameSelection.equalsIgnoreCase("NUMBERGUESS")) {
//                            this.play(new NumberGuessGame(), new NumberGuessPlayer(casinoAccount));
                } else if (gameSelection.equalsIgnoreCase("WAR")) {
                    this.play(new WarGame(), new WarGamePlayer(this.casinoAccount));
                } else if (gameSelection.equalsIgnoreCase("CRAPS")) {
//                    this.play()
                } else {
                    console.getStringInput("Please select a game to play");
                }
            }
        }


    public void startGameReal() {

            String gameInput = getArcadeDashboardInput();
            if(gameInput.equalsIgnoreCase("create-account")){
                String accountName = console.getStringInput("Enter a name for your account:");
                String accountPassword = console.getStringInput("Enter a password for your account");
                Integer accountBalance = console.getIntegerInput("Enter how much you want to deposit into your account");

                this.casinoAccount = casinoAccountManager.createAccount(accountName, accountPassword, accountBalance);
            } else if (gameInput.equalsIgnoreCase("select-game")) {
                String gameSelection = getGameSelectionInput();
                if (gameSelection.equalsIgnoreCase("SLOTS")) {
                    this.play(new SlotsGame(), new SlotsPlayer(this.casinoAccount));
                } else if (gameSelection.equalsIgnoreCase("BLACKJACK")) {
//                            this.play(new BlackjackGame(), new BlackjackPlayer(casinoAccount));
                } else if (gameSelection.equalsIgnoreCase("ROULETTE")) {
                    this.play(new RouletteGame(), new RoulettePlayer(this.casinoAccount));
                } else if (gameSelection.equalsIgnoreCase("NUMBERGUESS")) {
//                            this.play(new NumberGuessGame(), new NumberGuessPlayer(casinoAccount));
                } else if (gameSelection.equalsIgnoreCase("WAR")) {
                    this.play(new WarGame(), new WarGamePlayer(this.casinoAccount));
                } else if (gameSelection.equalsIgnoreCase("CRAPS")) {
//                    this.play()
                } else {
                    console.getStringInput("Please select a game to play");
                }
            }
    }

    public void startGame() {
        boolean startGame = true;
            String accountName = console.getStringInput("Enter a name for your account:");
            String accountPassword = console.getStringInput("Enter a password for your account");
            Integer accountBalance = console.getIntegerInput("Enter how much you want to deposit into your account");

            casinoAccount = casinoAccountManager.createAccount(accountName, accountPassword, accountBalance);
            startGame = false;
        //            casinoAccount.registerAccount(CasinoAccount);
        }



    public void startGamePart1() {
        boolean startGamePart1 = true;
            String gameSelection = getGameSelectionInput();
            if (gameSelection.equalsIgnoreCase("SLOTS")) {
                this.play(new SlotsGame(), new SlotsPlayer(casinoAccount));
                startGamePart1 = false;
            } else if (gameSelection.equalsIgnoreCase("BLACKJACK")) {
//                            this.play(new BlackjackGame(), new BlackjackPlayer(casinoAccount));
                startGamePart1 = false;
            } else if (gameSelection.equalsIgnoreCase("ROULETTE")) {
                this.play(new RouletteGame(), new RoulettePlayer(casinoAccount));
                startGamePart1 = false;
            } else if (gameSelection.equalsIgnoreCase("NUMBERGUESS")) {
//                            this.play(new NumberGuessGame(), new NumberGuessPlayer(casinoAccount));
                startGamePart1 = false;
            } else if (gameSelection.equalsIgnoreCase("WAR")) {
                this.play(new WarGame(), new WarGamePlayer(casinoAccount));
                startGamePart1 = false;
            } else if (gameSelection.equalsIgnoreCase("CRAPS")) {
//                    this.play()
                startGamePart1 = false;
            } else {
                console.getStringInput("Please select a game to play");
                startGamePart1 = false;
            }
        }



    public void play(Object gameObject, Object playerObject) {
        GameInterface game = (GameInterface)gameObject;
//        for (PlayerInterface player : casAcc) {
//            PlayerInterface player = (PlayerInterface)playerObject;
//            game.add(player);
//        }
        PlayerInterface player = (PlayerInterface)playerObject;
        game.add(player);
        game.run();
    }

    public void moveGame() {
        String move = console.getStringInput("Do you want to play another game? Enter 3\n" +
                "Or quit casino and save your funds? Enter 4");
        if(move.equals("3")) {
            getGameSelectionInput();
        } else if (move.equals("4")) {  //TODO Need to create the else statement for not qutting
            System.out.println("Good bye");
            System.exit(0);
        }
    }



    public void bet() {
        System.out.println("You have ");  //TODO need to get the account amount
        int bet = console.getIntegerInput("How much do you want to bet?");
//        while(bet>maxBet) {
//            console.getIntegerInput("That bet is too high for this game, please enter a new bet");
//        }
//        while (bet<minBet) {
//            console.getIntegerInput("That bet is too low for this game. Please enter a new bet");
//        }

    }

    public void quit() {
        String quit = console.getStringInput("Do you want to move to another game?");
        if(quit.equals("1")) {
            //TODO need to figure out how to quit the whole game
        }
    }

}

