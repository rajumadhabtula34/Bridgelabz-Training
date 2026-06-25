package com.wagecomputation;

public class EmployeeWageComputationAsPartTime {

    public static void main(String[] args) {

        final int PART_TIME = 1;
        final int FULL_TIME = 2;

        final int EMP_RATE_PER_HOUR = 20;

        int empCheck = (int) Math.floor((Math.random()*10)%3);
        

        int empHours = 0;

        if (empCheck == PART_TIME) {
            empHours = 4;
        } else if (empCheck == FULL_TIME) {
            empHours = 8;
        }

        int empWage = empHours * EMP_RATE_PER_HOUR;

        System.out.println("Employee Wage : " + empWage);
    }
}