package com.musahibrahimali;

import java.util.Scanner;

public class TicTacToe {
    static int generateRandomMove(int used) {
        // generating random moves
        int rndMove = 0;
        if (used == 1){
            rndMove =  (int) (Math.random() * 8 + 1);
        }else if (used == 2){
            rndMove =  (int) (Math.random() * 8 + 1);
        }else if (used == 3){
            rndMove =  (int) (Math.random() * 8 + 1);
        }else if (used == 4){
            rndMove =  (int) (Math.random() * 8 + 1);
        }else if (used == 5){
            rndMove =  (int) (Math.random() * 8 + 1);
        }else if (used == 6){
            rndMove =  (int) (Math.random() * 8 + 1);
        }else if (used == 7){
            rndMove =  (int) (Math.random() * 8 + 1);
        }else if (used == 8){
            rndMove =  (int) (Math.random() * 8 + 1);
        }else if (used == 9){
            rndMove =  (int) (Math.random() * 8 + 1);
        }
        return rndMove;
    }

    // determine the winner of the game
    static void determineWinner(int winnerScore) {
        if (winnerScore == 12 | winnerScore == 18 | winnerScore == 15 | winnerScore == 6 | winnerScore == 24 | winnerScore == 16){
            System.out.println("congratulation, You won");
        }else {
            System.out.println("Oh! sorry, You Lost!!!! Loser!!!!!");
        }
    }

    static void moves(String userChoice, String compChoice) {
        Scanner scanner = new Scanner(System.in);
        int firstMove;
        int secondMove;
        int thirdMove;
        // The pre-assumed board
        String R1C1 = "", R1C2 = "", R1C3 = "";
        String R2C1 = "", R2C2 = "", R2C3 = "";
        String R3C1 = "", R3C2 = "", R3C3 = "";

        int records = 0;

        System.out.println("Where would you like to move first");
        firstMove = scanner.nextInt();
        if (firstMove == 1) {
            R1C1 = userChoice;
            records += 1;
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                compMove = generateRandomMove(1);
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (firstMove == 2) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                compMove = generateRandomMove(1);
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            R1C2 = userChoice;
            records += 2;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (firstMove == 3) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                compMove = generateRandomMove(1);
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            R1C3 = userChoice;
            records += 3;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (firstMove == 4) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                compMove = generateRandomMove(1);
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            R2C1 = userChoice;
            records += 4;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (firstMove == 5) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                compMove = generateRandomMove(1);
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            R2C2 = userChoice;
            records += 5;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (firstMove == 6) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                compMove = generateRandomMove(1);
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            R2C3 = userChoice;
            records += 6;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (firstMove == 7) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                compMove = generateRandomMove(1);
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            R3C1 = userChoice;
            records += 7;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (firstMove == 8) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                compMove = generateRandomMove(1);
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            R3C2 = userChoice;
            records += 8;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (firstMove == 9) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                compMove = generateRandomMove(1);
            }
            R3C3 = userChoice;
            records += 9;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else {
            System.out.println("invalid grid selection");
        }

        //// second move
        System.out.println("Where would you like to move next");
        secondMove = scanner.nextInt();
        if (secondMove == 1) {
            R1C1 = userChoice;
            records += 1;
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                compMove = generateRandomMove(1);
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (secondMove == 2) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                compMove = generateRandomMove(1);
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            R1C2 = userChoice;
            records += 2;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (secondMove == 3) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                compMove = generateRandomMove(1);
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            R1C3 = userChoice;
            records += 3;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (secondMove == 4) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                compMove = generateRandomMove(1);
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            R2C1 = userChoice;
            records += 4;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (secondMove == 5) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                compMove = generateRandomMove(1);
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            R2C2 = userChoice;
            records += 5;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (secondMove == 6) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                compMove = generateRandomMove(1);
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            R2C3 = userChoice;
            records += 6;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (secondMove == 7) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                compMove = generateRandomMove(1);
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            R3C1 = userChoice;
            records += 7;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (secondMove == 8) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                compMove = generateRandomMove(1);
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            R3C2 = userChoice;
            records += 8;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (secondMove == 9) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                compMove = generateRandomMove(1);
            }
            R3C3 = userChoice;
            records += 9;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else {
            System.out.println("invalid grid selection");
        }

        //// third move
        System.out.println("Where would you like to move again");
        thirdMove = scanner.nextInt();
        if (thirdMove == 1) {
            R1C1 = userChoice;
            records += 1;
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                compMove = generateRandomMove(1);
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (thirdMove == 2) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                compMove = generateRandomMove(1);
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            R1C2 = userChoice;
            records += 2;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (thirdMove == 3) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                compMove = generateRandomMove(1);
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            R1C3 = userChoice;
            records += 3;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (thirdMove == 4) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                compMove = generateRandomMove(1);
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            R2C1 = userChoice;
            records += 4;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (thirdMove == 5) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                compMove = generateRandomMove(1);
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            R2C2 = userChoice;
            records += 5;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (thirdMove == 6) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                compMove = generateRandomMove(1);
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            R2C3 = userChoice;
            records += 6;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (thirdMove == 7) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                compMove = generateRandomMove(1);
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            R3C1 = userChoice;
            records += 7;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (thirdMove == 8) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                compMove = generateRandomMove(1);
            }else if (compMove == 9){
                R3C3 = compChoice;
            }
            R3C2 = userChoice;
            records += 8;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else if (thirdMove == 9) {
            int compMove = generateRandomMove(1);
            if (compMove == 1){
                R1C1 = compChoice;
            }else if (compMove == 2){
                R1C2 = compChoice;
            }else if (compMove == 3){
                R1C3 = compChoice;
            }else if (compMove == 4){
                R2C1 = compChoice;
            }else if (compMove == 5){
                R2C2 = compChoice;
            }else if (compMove == 6){
                R2C3 = compChoice;
            }else if (compMove == 7){
                R3C1 = compChoice;
            }else if (compMove == 8){
                R3C2 = compChoice;
            }else if (compMove == 9){
                compMove = generateRandomMove(1);
            }
            R3C3 = userChoice;
            records += 9;
            System.out.print("__" + R1C1 + "__|__" + R1C2 + "__|__" + R1C3 + "__|\n__" + R2C1 + "__|__" + R2C2 + "__|__" + R2C3 + "__|\n__" + R3C1 + "__|__" + R3C2 + "__|__" + R3C3 + "__|\n");
        } else {
            System.out.println("invalid grid selection");
        }

        determineWinner(records);

    }

    public static void main(String[] args) {
        String computerChoice;
        String userOneChoice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which character would you like to be, 'x' or 'o' ?");
        String choice = scanner.nextLine().toLowerCase();

        System.out.print("__R1C1__|__R1C2__|__R1C3__|\n__R2C1__|__R2C2__|__R2C3__|\n__R3C1__|__R3C2__|__R3C3__|\n");
        // row 1
        System.out.print("1 = Row1 Column 1\n");
        System.out.print("2 = Row1 Column 2\n");
        System.out.print("3 = Row1 Column 3\n");

        // row two
        System.out.print("4 = Row2 Column 1\n");
        System.out.print("5 = Row2 Column 2\n");
        System.out.print("6 = Row2 Column 3\n");

        // row three
        System.out.print("7 = Row3 Column 1\n");
        System.out.print("8 = Row3 Column 2\n");
        System.out.print("9 = Row3 Column 3\n");


        if (choice.equals("x")) {
            userOneChoice = "X";
            computerChoice = "O";
            moves(userOneChoice, computerChoice);
        } else if (choice.equals("o")) {
            userOneChoice = "O";
            computerChoice = "X";
            moves(userOneChoice, computerChoice);
        } else {
            System.out.println("Invalid Option");
        }

    }
}
