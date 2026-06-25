package com.gamblingsimulator;

public class GamblingSimulator6 {

    public static int playGame() {
        return Math.random() < 0.5 ? 1 : -1;
    }

    public static int playDay() {
        int stake = 100;

        while (stake > 50 && stake < 150) {
            stake += playGame();
        }

        return stake - 100;
    }

    public static void main(String[] args) {

        int monthlyTotal = 0;

        for (int day = 1; day <= 20; day++) {
            monthlyTotal += playDay();
        }

        if (monthlyTotal > 0) {
            System.out.println("Continue Gambling");
        } else {
            System.out.println("Stop Gambling");
        }
    }
}