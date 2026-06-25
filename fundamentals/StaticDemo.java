package com.fundamentals;



public class StaticDemo {

    // Static Variable
    static int count;

    // Static Block
    static {
        System.out.println("Static Block Executed");
        count = 100;
    }

    // Static Method
    static void display() {
        System.out.println("Count = " + count);
    }

    public static void main(String[] args) {

        System.out.println("Main Method Executed");

        display();
    }
}
