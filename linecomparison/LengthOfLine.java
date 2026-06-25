package com.linecomparison;

public class LengthOfLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Welcome to Line Comparison Computation Program");
		 double res=calculateLength(1,2,3,4);
		 System.out.print(res);
		 

	}

	private static double calculateLength(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		return Math.sqrt(Math.pow(j-i,2)+Math.pow(l-k,2));
		
	}

}
