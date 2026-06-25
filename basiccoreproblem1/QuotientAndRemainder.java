package com.basiccoreproblem1;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);

        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        System.out.println("Quotient is :" +dividend/divisor);
        System.out.println("Remainder is :" +dividend%divisor);


	}

}
