package com.gamblingsimulator;

public class GamblingSimulator2 {

    public static int playGame() {
        return Math.random() < 0.5 ? 1 : -1;
    }

    public static int playDay() {
        int stake = 100;

        while (stake > 50 && stake < 150) {
            stake += playGame();
        }

        return stake;
    }

    public static void main(String[] args) {
        System.out.println("Final Stake: $" + playDay());
    }
}