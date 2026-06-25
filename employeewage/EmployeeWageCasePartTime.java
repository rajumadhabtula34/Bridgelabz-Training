package com.employeewage;

public class EmployeeWageCasePartTime {

    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {

        int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

        int empHours;

        switch (empCheck) {

            case PART_TIME:
                empHours = 4;
                break;

            case FULL_TIME:
                empHours = 8;
                break;

            default:
                empHours = 0;
        }

        int empWage = empHours * EMP_RATE_PER_HOUR;

        System.out.println("Employee Wage = " + empWage);
    }
}
