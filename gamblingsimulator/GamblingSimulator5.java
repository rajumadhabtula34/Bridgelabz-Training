package com.gamblingsimulator;

public class GamblingSimulator5 {

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

        int[] results = new int[20];

        int luckiestDay = 0;
        int unluckiestDay = 0;

        for (int day = 0; day < 20; day++) {
            results[day] = playDay();
        }

        for (int day = 1; day < 20; day++) {

            if (results[day] > results[luckiestDay]) {
                luckiestDay = day;
            }

            if (results[day] < results[unluckiestDay]) {
                unluckiestDay = day;
            }
        }

        System.out.println("Luckiest Day: " + (luckiestDay + 1));
        System.out.println("Unluckiest Day: " + (unluckiestDay + 1));
    }
}