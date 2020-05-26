package com.musahibrahimali;

import java.util.Scanner;

public class guessGame {
    public static void main(String[] args) {
        // write your code here
        String name;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your name");
        name = myScanner.nextLine(); // REad user input
        System.out.println("Hello and welcome " + name);
        System.out.println("Would you like to play the guessing game?");
        System.out.println("input 'y' for 'yes' or 'n' for 'no' ");
        String choice = myScanner.nextLine();
        String ch = choice.toLowerCase();
        if (ch.equals("y")){
            System.out.println("I have a number in mind. can you guess what the number is?");
            double number = myScanner.nextDouble();
            double guess = Math.random() * 20 + 1;
            if (number == guess){
                System.out.println("Congratulation, You had it right");
            } else if (number > guess){
                System.out.println("Please guess lower");
            }else if (number < guess){
                System.out.println("Please guess higher");
            }
            while (number != guess){
                System.out.println("Try Again, You were not right");
                number = myScanner.nextDouble();
                if (number == guess){
                    System.out.println("Congratulation, You had it right");
                } else if (number > guess){
                    System.out.println("Please guess lower");
                }else if (number < guess){
                    System.out.println("Please guess higher");
                }
            }
        }else {
            System.out.println("Thank you for your time " + name);
            System.out.println("Hope to see you again soon");
        }
    }
}
