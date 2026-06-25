package com.gamblingsimulator;

public class GamblingSimulator7 {

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

    public static int playMonth() {

        int monthlyTotal = 0;

        for (int day = 1; day <= 20; day++) {
            monthlyTotal += playDay();
        }

        return monthlyTotal;
    }

    public static void main(String[] args) {

        int month = 1;

        while (true) {

            int monthlyTotal = playMonth();

            System.out.println("Month " + month + " Total: $" + monthlyTotal);

            if (monthlyTotal <= 0) {
                System.out.println("Stop Gambling");
                break;
            }

            month++;
        }
    }
}