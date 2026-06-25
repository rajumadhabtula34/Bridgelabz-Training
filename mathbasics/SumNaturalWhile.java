package com.mathbasics;

import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i=1,sum=0;

        while(i<=n){
            sum+=i;
            i++;
        }

        System.out.println("Sum = "+sum);
    }
}