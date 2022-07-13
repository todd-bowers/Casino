package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.CasinoAccountManager;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.numberguess.NumberGuessGame;
import com.github.zipcodewilmington.casino.games.numberguess.NumberGuessPlayer;
import com.github.zipcodewilmington.casino.games.slots.SlotsGame;
import com.github.zipcodewilmington.casino.games.slots.SlotsPlayer;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

/**
 * Created by leon on 7/21/2020.
 */
public class Casino implements Runnable {
    private final IOConsole console = new IOConsole(AnsiColor.BLUE);



    @Override
    public void run() {
        boolean quit = true;
        while(quit) {
            String accountName = console.getStringInput("Enter your account name:");
            String accountPassword = console.getStringInput("Enter your account password:");
            String accountDeposit = String.valueOf(console.getDoubleInput("Hi " + accountName + "\n How much will you be depositing today?"));
//            CasinoAccountManager casinoAccountManager = new CasinoAccountManager();
//            CasinoAccount casinoAccount = casinoAccountManager.getAccount(accountName, accountPassword);
            if(accountName.equalsIgnoreCase("nick") && accountPassword.equalsIgnoreCase("frank")) {
                CasinoAccount casinoAccount = new CasinoAccount();
                casinoAccount.holdAccount(accountName, accountPassword);
//                casinoAccount.holdMoney();
                String gameSelectionInput = getGameSelectionInput().toUpperCase();
                if(gameSelectionInput.equalsIgnoreCase("NUMBERGUESS")){
                    play(new NumberGuessGame(), new NumberGuessPlayer()); //
                }
            }
        }
//        String arcadeDashBoardInput;
//        CasinoAccountManager casinoAccountManager = new CasinoAccountManager();
//        do {
//            arcadeDashBoardInput = getArcadeDashboardInput();
//            if ("select-game".equals(arcadeDashBoardInput)) {
//                String accountName = console.getStringInput("Enter your account name:");
//                String accountPassword = console.getStringInput("Enter your account password:");
//                CasinoAccount casinoAccount = casinoAccountManager.getAccount(accountName, accountPassword);
//                boolean isValidLogin = casinoAccount != null;
//                if (isValidLogin) {
//                    String gameSelectionInput = getGameSelectionInput().toUpperCase();
//                    if (gameSelectionInput.equalsIgnoreCase("SLOTS")) {
//                        play(new SlotsGame(), new SlotsPlayer());
//                    } else if (gameSelectionInput.equalsIgnoreCase("NUMBERGUESS")) {
//                        play(new NumberGuessGame(), new NumberGuessPlayer());
//                    } else if (gameSelectionInput.equalsIgnoreCase("BLACKJACK")){
////                        play(new NumberGuessGame(), new NumberGuessPlayer());
//                    } else if (gameSelectionInput.equalsIgnoreCase("ROULETTE")){
////                        play(new NumberGuessGame(), new NumberGuessPlayer());
//                    } else {
//                        // TODO - implement better exception handling
//                        String errorMessage = "[ %s ] is an invalid game selection";
//                        throw new RuntimeException(String.format(errorMessage, gameSelectionInput));
//                    }
//                } else {
//                    // TODO - implement better exception handling
//                    String errorMessage = "No account found with name of [ %s ] and password of [ %s ]";
//                    throw new RuntimeException(String.format(errorMessage, accountPassword, accountName));
//                }
//            } else if ("create-account".equals(arcadeDashBoardInput)) {
//                console.println("Welcome to the account-creation screen.");
//                String accountName = console.getStringInput("Enter your account name:");
//                String accountPassword = console.getStringInput("Enter your account password:");
//                CasinoAccount newAccount = casinoAccountManager.createAccount(accountName, accountPassword);
//                casinoAccountManager.registerAccount(newAccount);
//            }
//        } while (!"logout".equalsIgnoreCase(arcadeDashBoardInput));
    }

    
    private String getArcadeDashboardInput() {
        return console.getStringInput(new StringBuilder()
                .append("Welcome to the Arcade Dashboard!")
                .append("\nFrom here, you can select any of the following options:")
                .append("\n\t[ create-account ], [ select-game ]")
                .toString());
    }

    private String getGameSelectionInput() {
        return console.getStringInput(new StringBuilder()
                .append("Welcome to the Game Selection Dashboard!")
                .append("\nFrom here, you can select any of the following options:")
                .append("\n\t[ SLOTS ], [ NUMBERGUESS ], [ BLACKJACK ], [ ROULETTE ]")
                .toString());
    }

    public void play(Object gameObject, Object playerObject) {
        GameInterface game = (GameInterface)gameObject;
        PlayerInterface player = (PlayerInterface)playerObject;
        game.add(player);
        game.run();
    }

    public void moveGame() {
        String move = console.getStringInput("Do you want to play another game? Enter 3");
        if(move.equals("3")) {
            getGameSelectionInput();
        } else {  //TODO Need to create the else statement for not qutting

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
