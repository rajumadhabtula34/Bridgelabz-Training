package com.mathbasics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int temp=n;
        int rev=0;

        for(;n>0;n/=10){
            rev=rev*10+n%10;
        }

        if(temp==rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}