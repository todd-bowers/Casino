package com.github.zipcodewilmington.casino.games.roulette;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class rouletteGame extends ballGenerator {

    Scanner betOption = new Scanner(System.in);
    int money = 1000;
    int num;
    ballGenerator gen;
    Scanner input = new Scanner(System.in);
    String bet = input.next();

    public rouletteGame(){
        gen = new ballGenerator();
    }
    public void printSummary(){
        System.out.println("Welcome to Roulette!");
        System.out.println("Below is the pay out of your desired option.");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| Bet              | Payout          | Probability   |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| [1]Red           | 1 : 1           | ~47.6%        |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| [2]Black         | 1 : 1           | ~47.3%        |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| [3]Odd           | 1 : 1           | ~47.3%        |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| [4]Even          | 1 : 1           | ~47.3%        |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| [5]Single number | 35 : 1          | ~2.6%         |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| [6]First Twelve  | 2 : 1           | ~31.5         |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| [7]Second Twelve | 2 : 1           | ~31.5         |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| [8]Third Twelve  | 2 : 1           | ~31.5         |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| [9]  No. 1 - 18  | 1 : 1           | ~31.5         |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| [10] No. 19 - 36 | 1 : 1           | ~31.5         |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("Please decide how much you want to bet and chose bet. ");
        System.out.println("//////////////////////////////////////////////////////");
    }
    public void printHelp(){
        if(betOption.equals("help")){
            System.out.println("Here is the help desk.");
            System.out.println("Below is the pay out of your desired option.");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| Bet              | Payout          | Probability   |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [1]Red           | 1 : 1           | ~47.6%        |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [2]Black         | 1 : 1           | ~47.3%        |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [3]Odd           | 1 : 1           | ~47.3%        |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [4]Even          | 1 : 1           | ~47.3%        |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [5]Single number | 35 : 1          | ~2.6%         |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [6]First Twelve  | 2 : 1           | ~31.5         |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [7]Second Twelve | 2 : 1           | ~31.5         |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [8]Third Twelve  | 2 : 1           | ~31.5         |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [9]  No. 1 - 18  | 1 : 1           | ~31.5         |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [10] No. 19 - 36 | 1 : 1           | ~31.5         |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("//////////////////////////////////////////////////////");
            System.out.println("Please decide how much you want to bet and chose bet. ");
            System.out.println("//////////////////////////////////////////////////////");
        }
    }
    public void winningMethod(){
        //Bet is red and received a 1 : 1 payout.
//        if(betOption.equals("1") && bet.equals(gen.generator())){
//           bet += money;
        //Bet is red and receive a 1 : 1 payout.
        if(betOption.equals("1") && gen.generator().equals("red"))  bet += money;
        //Bet is black and receive a 1 : 1 payout.
        if(betOption.equals("2") && gen.generator().equals("black"))  bet += money;
        //Bet is odd and receive a 1 : 1 payout.
        if(betOption.equals("3") && gen.generator().equals("odd"))  bet += money;
        //Bet is even and receive a 1 : 1 payout.
        if(betOption.equals("4") && gen.generator().equals("even"))  bet += money;
        //Bet is Single Number and receive a 35 : 1 payout.
        if(betOption.equals("5") && gen.generator().equals("single number"))  bet += money;
        //Bet is First Twelve and receive a 2 : 1 payout.
        if(betOption.equals("6") && gen.generator().equals("First Twelve"))  bet += money;
        //Bet is Second Twelve and receive a 2 : 1 payout.
        if(betOption.equals("7") && gen.generator().equals("Second Twelve"))  bet += money;
        //Bet is Third Twelve and receive a 2 : 1 payout.
        if(betOption.equals("8") && gen.generator().equals("Third Twelve"))  bet += money;
        //Bet is No. 1 - 18 and receive a 1 : 1 payout.
        if(betOption.equals("9") && gen.generator().equals("No.1 -18"))  bet += money;
        //Bet is No. 19 - 36 and receive a 1 : 1 payout.
        if(betOption.equals("10") && gen.generator().equals("No. 19 - 36"))  bet += money;
    }
}
