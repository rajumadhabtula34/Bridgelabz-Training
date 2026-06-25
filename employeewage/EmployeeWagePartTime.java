package com.employeewage;

public class EmployeeWagePartTime {

    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {

        int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

        int empHours = 0;

        if (empCheck == PART_TIME)
            empHours = 4;
        else if (empCheck == FULL_TIME)
            empHours = 8;
        else
            empHours = 0;

        int empWage = empHours * EMP_RATE_PER_HOUR;

        System.out.println("Employee Wage = " + empWage);
    }
}
