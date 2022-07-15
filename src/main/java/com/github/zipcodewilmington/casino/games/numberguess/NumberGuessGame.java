package com.github.zipcodewilmington.casino.games.numberguess;
import java.util.Scanner;
import java.util.Random;
/**
 * Created by leon on 7/21/2020.
 */
public class NumberGuessGame {
    public static int playerGuess;
    public static int randomNumber;
    Scanner playerObject = new Scanner(System.in);
    String playerName;

    public static void main(String[] args) {

        Random rand = new Random();
        int randomNumber = rand.nextInt(11) + 2;
        System.out.println("Random number is a secret");
        Scanner scanner = new Scanner((System.in));
        System.out.println("Pick a number between 2 and 12: ");

        int counter = 0;

        while (true) {
            int playerGuess = scanner.nextInt();
            if (playerGuess == randomNumber) {
                System.out.println("Congratulations! You win!");
                System.out.println("It took you " + counter + " tries");
                break;

            } else {
                System.out.println("Nope, guess again!");
                counter++;
            }

        }

    }
}