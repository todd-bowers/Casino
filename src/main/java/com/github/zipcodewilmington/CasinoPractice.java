package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.*;
import com.github.zipcodewilmington.casino.games.PracticeGamesAndPlayerClasses.*;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

import java.util.List;

public class CasinoPractice implements Runnable{
    private final IOConsole console = new IOConsole(AnsiColor.BLUE);
    CasinoAccountManagarPractice casinoAccountManager = new CasinoAccountManagarPractice();
    CasinoAccountPractice casinoAccount = new CasinoAccountPractice();




    @Override
    public void run() {
//        if(getArcadeDashboardInput().equalsIgnoreCase("login")){
//
//        }
        boolean createAccount = true;
        while(createAccount) {
            if (getArcadeDashboardInput().equalsIgnoreCase("create-account")) {
                boolean game = true;
                String accountName = console.getStringInput("Enter a name for your account:");
                String accountPassword = console.getStringInput("Enter a password for your account");
                Integer accountBalance = console.getIntegerInput("Enter how much you want to deposit into your account");

                casinoAccount = casinoAccountManager.createAccount(accountName, accountPassword, accountBalance);
                //            casinoAccount.registerAccount(CasinoAccount);
                if (getArcadeDashboardInput().equalsIgnoreCase("select-game")) {
                    String gameSelection = getGameSelectionInput();
                    while (game) {
                        if (gameSelection.equalsIgnoreCase("SLOTS")) {
                            this.play(new SlotsPracticeGame(), new SlotsPracticePlayer(casinoAccount));
                            game = false;
                        } else if (gameSelection.equalsIgnoreCase("BLACKJACK")) {
                            this.play(new BlackPracticeGame(), new BlackJackPlayerPractice(casinoAccount));
                            game = false;
                        } else if (gameSelection.equalsIgnoreCase("ROULETTE")) {
                            this.play(new RouletteGamePractice(), new RoulettePlayerPractice(casinoAccount));
                            game = false;
                        } else if (gameSelection.equalsIgnoreCase("NUMBERGUESS")) {
                            this.play(new NumberGuessGamePractice(), new NumberGuessPlayerPractice(casinoAccount));
                            game = false;
                        } else if (gameSelection.equalsIgnoreCase("WAR")) {
                            this.play(new WarGamePractice(), new WarGamePracticePlayer(casinoAccount));
                            game = false;
                        } else if (gameSelection.equalsIgnoreCase("CRAPS")) {
//                    this.play()
                        } else {
                            console.getStringInput("Please select a game to play");
                        }
                    }
                }

            }

        }


//            if (getArcadeDashboardInput().equalsIgnoreCase("select-game")) {
//                SlotsPlayer x = new SlotsPlayer();
//                SlotsGame y = new SlotsGame();
//                x.getArcadeAccount();
//                y.add(x);
//            }
    }

//    public HashMap<String, Integer> getAccount(String name, Integer balance){
//        this.name = name;
//        this.balance = balance;
//        this.casinoAccountList = new HashMap<>();
//        this.casinoAccountList.put(name, balance);
//
//        return this.casinoAccountList;
//    }

//    public List<CasinoAccount> sendAccount() {
//        List<CasinoAccount> casinoList = new ArrayList<>();
//        String accountName = console.getStringInput("Enter a name for your account:");
//        String accountPassword = console.getStringInput("Enter a password for your account");
//        Integer accountBalance = console.getIntegerInput("Enter how much you want to deposit into your account");
//        CasinoAccount casinoAcc = new CasinoAccount(accountName, accountPassword);
//        casinoList.add(casinoAcc);
//
//        return casinoList;
//    }


//                CasinoAccountManager.registerAccount(newAccountM);
//
//                ArrayList<CasinoManagement> casinoAccounts = new ArrayList<>(1);
//                casinoAccounts.add(newAccountM);
//
//            }
//
//            if(accountName.equalsIgnoreCase("nick") && accountPassword.equalsIgnoreCase("frank")) {
//
////                casinoAccount.holdMoney();
//                String gameSelectionInput = getGameSelectionInput().toUpperCase();
//                if(gameSelectionInput.equalsIgnoreCase("NUMBERGUESS")){
//                    play(new NumberGuessGame(), new NumberGuessPlayer()); //
//                }
//            }

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


    private String getArcadeDashboardInput() {
        return console.getStringInput("Welcome to the Arcade Dashboard!" +
                "\nFrom here, you can select any of the following options:" +
                "\n\t[ create-account ], [ select-game ], [login/logout]");
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
