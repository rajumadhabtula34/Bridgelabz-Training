package com.gamblingsimulator;

public class GamblingSimulator1 {

    public static int playGame() {
        return Math.random() < 0.5 ? 1 : -1;
    }

    public static void main(String[] args) {
        int result = playGame();

        if (result == 1) {
            System.out.println("Won $1");
        } else {
            System.out.println("Lost $1");
        }
    }
}
