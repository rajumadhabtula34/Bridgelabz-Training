package com.linecomparison;

public class LineComparision {
	
	public static void main(String[]args) {
		   
		Double line1=calculateLength(1,2,3,4);
		Double line2=calculateLength(5,6,7,8);
		if(line1.equals(line2)) {
			   System.out.print("both are equal");
		}
		else {
			  System.out.print("not equal");
		}
		
	}

	private static Double calculateLength(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		return Math.sqrt(Math.pow(j-i,2)+Math.pow(l-k,2));
		
	}

}
