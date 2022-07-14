package com.github.zipcodewilmington.casino.games.numberguess;
import java.util.Scanner;
import java.util.Random;
/**
 * Created by leon on 7/21/2020.
 */
public class NumberGuessGame {
//Prompt for game menu
//Start game(user presses space bar)
// Exit game(user presses delete)
    //if player starts game, "welcome player"
    //ask player to pick a number btwn 2-12(user presses numbers on keyboard)
    //player will be informed that they have max of 3 rounds "You will have a total of three guesses"
    //player will roll dice"player press enter to activate random number generator aka dice"
    //if the sum of the dice roll is higher than the secret number, print "Too high, try again!"
    //if the sum of the dice roll is lower than the secret number, print "Too low, try again!"
    //if the sum of the dice roll is equal to the secret number, print "Congratulation! Win! Win! Win!"
    //After 3rd try, print "Game Over!"
    //After Game Over, prompt player back to Main Menu
    Scanner playerObject = new Scanner(System.in);//for user input
    String playerName;

    String userName = playerObject.nextLine();

    public String startGame(String input){
        System.out.print("Welcome Player!");
        System.out.print("Enter username");
        System.out.print("You have a maximum of 3 rounds!");
        System.out.print("Press 1 to roll dice");
        if(userName.equals("1")){
            diceRoll(1);
        }
        return null;
    }
  public String exitGame(String input){
      System.out.print("Push Delete Key");
        return null;
  }
  public Integer diceRoll(Integer input){

        return null;
  }

}