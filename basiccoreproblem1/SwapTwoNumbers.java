package com.basiccoreproblem1;

import java.util.Scanner;

/**
 * 
 */
public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		System.out.println (a1+" "+a2);
		a1=a2+a1;
		a2=a1-a2;
		a1=a1-a2;
		System.out.println (a1+" "+a2);
		

	}

}
