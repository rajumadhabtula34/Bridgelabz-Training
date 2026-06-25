package com.wagecomputation;

public class EmployeeWageComputationPerHours {

    public static void main(String[] args) {

        final int IS_PRESENT = 1;
        final int EMP_RATE_PER_HOUR = 20;
        final int FULL_DAY_HOUR = 8;

        int empCheck = (int) Math.floor((Math.random() * 10)%2);

        int empHours = 0;

        if (empCheck == IS_PRESENT) {
            empHours = FULL_DAY_HOUR;
        }

        int empWage = empHours * EMP_RATE_PER_HOUR;

        System.out.println("Daily Employee Wage : " + empWage);
    }
}
