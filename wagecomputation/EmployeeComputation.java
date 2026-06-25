package com.wagecomputation;

public class EmployeeComputation {

    public static void main(String[] args) {

        int isPresent = 1;

        int empCheck = (int) Math.floor((Math.random() * 10)%2);

        if (empCheck == isPresent) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
