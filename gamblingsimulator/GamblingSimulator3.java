package com.gamblingsimulator;

public class GamblingSimulator3 {

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

    public static int getMonthlyTotal() {
        int total = 0;

        for (int day = 1; day <= 20; day++) {
            total += playDay();
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println("Monthly Total: $" + getMonthlyTotal());
    }
}