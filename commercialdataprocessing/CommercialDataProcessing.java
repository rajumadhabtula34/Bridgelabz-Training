package com.commercialdataprocessing;

public class CommercialDataProcessing {

    public static void main(String[] args) {

        StockAccount stockAccount = new StockAccount("StockData.txt");

        stockAccount.buy(20, "TCS", 1500);

        stockAccount.buy(15, "INFY", 1800);

        stockAccount.buy(10, "WIPRO", 350);

        stockAccount.sell(5, "INFY");

        stockAccount.printReport();

        stockAccount.save("StockData.txt");
    }
}