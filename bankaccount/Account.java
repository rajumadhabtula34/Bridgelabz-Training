package com.bankaccount;

public class Account {

    private double balance;

    public Account(double balance) {

        if (balance > 0) {
            this.balance = balance;
        }
    }

    public void credit(double amount) {

        balance = balance + amount;
    }

    public void debit(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Debit amount exceeded account balance.");
        }
    }

    public double getBalance() {

        return balance;
    }
}