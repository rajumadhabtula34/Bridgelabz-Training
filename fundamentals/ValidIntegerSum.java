package com.fundamentals;

public class ValidIntegerSum {
	public static void main(String[]args) {
		   int sum=0;
		   int invalid=0;
		   for(String arg:args) {
			   try{   
			   sum=sum+(Integer.parseInt(arg));
			   }
			   catch(Exception e) {
				         invalid++;
			   }
			      
		   }
		   System.out.println("Sum of valid integers = " + sum);
	        System.out.println("Invalid integers count = " + invalid);
	}

}
