package com.basiccoreproblem2;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.print(0+" ");
        System.out.print(1+" ");
        int a=0;
        int b=1;
        for(int i=2;i<=n;i++) {
        	int c=a+b;
        	System.out.print(c+" ");
        	a=b;
        	b=c;
        }

	}

}
