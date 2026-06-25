package com.basiccoreproblem2;

import java.util.Scanner;

public class CouponNumbers {

    public static int generateCoupon(int n) {
        return (int)(Math.random() * n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        boolean[] couponCollected = new boolean[n];

        int distinctCount = 0;
        int totalRandomNumbers = 0;

        while(distinctCount < n) {

            int coupon = generateCoupon(n);

            totalRandomNumbers++;

            if(!couponCollected[coupon]) {
                couponCollected[coupon] = true;
                distinctCount++;
            }
        }

        System.out.println("Total random numbers generated: "
                           + totalRandomNumbers);
    }
}