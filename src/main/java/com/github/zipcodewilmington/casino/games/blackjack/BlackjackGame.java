//package com.github.zipcodewilmington.casino.games.blackjack;
//
//import com.github.zipcodewilmington.casino.GameInterface;
//import com.github.zipcodewilmington.casino.PlayerInterface;
//import com.github.zipcodewilmington.casino.games.card.Shoe;
//import com.github.zipcodewilmington.casino.games.card.deck.Deck;
//import com.github.zipcodewilmington.utils.AnsiColor;
//import com.github.zipcodewilmington.utils.IOConsole;
//
//import java.util.LinkedList;
//import java.util.Scanner;
//
//public class BlackjackGame extends Deck implements GameInterface {
//
//
//    private final IOConsole console = new IOConsole(AnsiColor.AUTO);
//    public LinkedList<BlackjackPlayer> blackjackPlayer = new LinkedList<>();
//
//
//
//    public void add(PlayerInterface player) {
//        blackjackPlayer.add((BlackjackPlayer) player);
//
//    }
//
//    public void  run(){
//    }
//
//    public void blackjack(){
//    }
//
//    public Scanner setBet(){
//
//        int bet;
//        String input = console.getStringInput("Minimum bet is $5!");
//        Scanner userInput = new Scanner(System.in);
//        userInput.nextDouble();
//        if (userInput.nextDouble() < 5){
//            System.out.println("You must bet $5 or more");
//        } else if (userInput.nextDouble() > 5) {
//            System.out.println("You bet " + userInput);
//
//        }
//        return userInput;
//
//
//    }
//
//    public void betOption(){
//       // Scanner userInput = new Scanner(System.in);
//       // if ( i!= 21) {
//         //   System.out.println("Would you like to Hit or Stand?");
//           // userInput.nextLine();
//        //if (userInput == Hit){
//          //  draw();
//        //} else {
//
//       // }
//
//
//      //  }
//
//    }
//
//
//
//        public void win(PlayerInterface player, int winnings){
////       //collect player winnings
//            //add to account
//    }
//        public void losings(PlayerInterface player, int losings){
//        //collect losings
//            //deduct from account
//        }
//
//    public Shoe getShoe() {
//        return null;
//
//    }
//
//
//
//
//    @Override
//    public void remove(PlayerInterface player) {
//        blackjackPlayer.add((BlackjackPlayer) player);
//    }
//
//
//
//            public String toString() {
//                return null;
//            }
//
//        }
//
//
//
//
