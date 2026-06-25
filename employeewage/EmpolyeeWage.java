package com.employeewage;



public class EmpolyeeWage {
	
	public static void main(String[]args) {
		  int EMP_RATE_PER_HOUR = 20;
	        int FULL_DAY_HOUR = 8;

	        int empCheck = (int) (Math.floor(Math.random() * 10) % 2);

	        if (empCheck == 1) {
	            int empWage = EMP_RATE_PER_HOUR * FULL_DAY_HOUR;
	            System.out.println("Daily Employee Wage = " + empWage);
	        } else {
	            System.out.println("Employee Absent, Wage = 0");
	        }
	}
       
}
