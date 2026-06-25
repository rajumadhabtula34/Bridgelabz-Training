package com.wagecomputation;

public class CalculateAgeTillConditionMet {

    public static void main(String[] args) {

        final int PART_TIME = 1;
        final int FULL_TIME = 2;

        final int EMP_RATE_PER_HOUR = 20;

        final int MAX_HOURS_IN_MONTH = 100;
        final int MAX_WORKING_DAYS = 20;

        int totalEmpHours = 0;
        int totalWorkingDays = 0;

        while (totalEmpHours <= MAX_HOURS_IN_MONTH &&
                totalWorkingDays < MAX_WORKING_DAYS) {

            totalWorkingDays++;

            int empCheck = (int) (Math.random() * 3);

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

            totalEmpHours += empHours;
        }

        int totalEmpWage = totalEmpHours * EMP_RATE_PER_HOUR;

        System.out.println("Total Days Worked : " + totalWorkingDays);
        System.out.println("Total Hours Worked : " + totalEmpHours);
        System.out.println("Total Employee Wage : " + totalEmpWage);
    }
}