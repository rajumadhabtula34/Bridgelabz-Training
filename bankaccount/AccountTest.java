package com.bankaccount;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Account account = new Account(1000);

        System.out.println("Current Balance : " + account.getBalance());

        System.out.print("Enter Debit Amount : ");
        double debitAmount = scanner.nextDouble();

        account.debit(debitAmount);

        System.out.println("Updated Balance : " + account.getBalance());

        scanner.close();
    }
}