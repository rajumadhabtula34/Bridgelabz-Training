package com.stockaccountmanagement;

import java.util.ArrayList;

public class StockPortfolio {

    ArrayList<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void printStockReport() {

        double totalValue = 0;

        System.out.println("\n----- STOCK REPORT -----");

        for (Stock stock : stocks) {

            double stockValue = stock.calculateStockValue();

            System.out.println("\nStock Name : " + stock.stockName);
            System.out.println("Number of Shares : " + stock.numberOfShares);
            System.out.println("Share Price : " + stock.sharePrice);
            System.out.println("Stock Value : " + stockValue);

            totalValue += stockValue;
        }

        System.out.println("\n--------------------------");
        System.out.println("Total Stock Value : " + totalValue);
    }
}
