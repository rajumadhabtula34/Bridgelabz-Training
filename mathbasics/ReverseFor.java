package com.mathbasics;

import java.util.Scanner;

public class ReverseFor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int rev=0;

        for(;n>0;n/=10){
            rev=rev*10+n%10;
        }

        System.out.println(rev);
    }
}
