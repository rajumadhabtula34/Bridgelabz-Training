package com.commercialdataprocessing;

import java.time.LocalDateTime;

public class CompanyShares {

    String symbol;
    int numberOfShares;
    double sharePrice;
    LocalDateTime transactionTime;

    public CompanyShares(String symbol, int numberOfShares, double sharePrice) {
        this.symbol = symbol;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
        this.transactionTime = LocalDateTime.now();
    }

    public double getValue() {
        return numberOfShares * sharePrice;
    }
}
