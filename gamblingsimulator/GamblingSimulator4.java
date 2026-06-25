package com.gamblingsimulator;
public class GamblingSimulator4 {

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

        for (int day = 1; day <= 20; day++) {

            int amount = playDay();

            if (amount > 0) {
                System.out.println("Day " + day + " Won $" + amount);
            } else {
                System.out.println("Day " + day + " Lost $" + Math.abs(amount));
            }
        }
    }
}