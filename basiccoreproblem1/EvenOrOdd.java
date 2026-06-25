package com.basiccoreproblem1;

import java.util.Scanner;

/**
 * 
 */
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.print((a&1)==0 ?"even":"odd");

	}

}
