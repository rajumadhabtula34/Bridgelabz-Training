package com.mathbasics;

import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        char ch=sc.next().charAt(0);

        switch(Character.toLowerCase(ch)){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}
