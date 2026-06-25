package com.basiccoreproblem1;

import java.util.Scanner;

public class HeadOrTail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<1) {
			   System.out.print("invalid input");
			   return;
		}
		int headcount=0;
		int tailcount=0;
		for(int i=0;i<n;i++) {
			  double val=Math.random();
			  if(val<0.5) {
				    tailcount++;
			  }
			  else {
				      headcount++;
			  }
		}
		double headpercentage=(headcount*100.0)/n;
		double tailpercentage=(tailcount*100.0)/n;
		System.out.print("head percentage  is "+headpercentage);
		System.out.print("tail percentage  is "+tailpercentage);
		
		

	}


}
