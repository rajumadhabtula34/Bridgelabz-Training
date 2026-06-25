package com.stockaccountmanagement;

import java.util.Scanner;

public class StockAccountManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StockPortfolio portfolio = new StockPortfolio();

        System.out.print("Enter Number of Stocks : ");
        int numberOfStocks = scanner.nextInt();

        scanner.nextLine();

        for (int i = 1; i <= numberOfStocks; i++) {

            System.out.println("\nEnter Details of Stock " + i);

            System.out.print("Stock Name : ");
            String stockName = scanner.nextLine();

            System.out.print("Number of Shares : ");
            int numberOfShares = scanner.nextInt();

            System.out.print("Share Price : ");
            double sharePrice = scanner.nextDouble();

            scanner.nextLine();

            Stock stock = new Stock(stockName, numberOfShares, sharePrice);

            portfolio.addStock(stock);
        }

        portfolio.printStockReport();

        scanner.close();
    }
}