package com.basiccoreproblem1;


import java.util.Scanner;

public class HarmonicNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Invalid Input");
            return;
        }

        double harmonic = 0.0;

        for (int i = 1; i <= n; i++) {
            harmonic += 1.0 / i;
        }

        System.out.println("Nth Harmonic Value = " + harmonic);

            }
}
