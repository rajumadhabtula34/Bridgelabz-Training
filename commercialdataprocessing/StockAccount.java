package com.commercialdataprocessing;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StockAccount {

    ArrayList<CompanyShares> companyShares = new ArrayList<>();

    public StockAccount(String filename) {
        System.out.println("Stock Account Created : " + filename);
    }

    public double valueOf() {

        double totalValue = 0;

        for (CompanyShares company : companyShares) {
            totalValue += company.getValue();
        }

        return totalValue;
    }

    public void buy(int amount, String symbol, double sharePrice) {

        for (CompanyShares company : companyShares) {

            if (company.symbol.equalsIgnoreCase(symbol)) {

                company.numberOfShares += amount;
                company.transactionTime = java.time.LocalDateTime.now();
                return;
            }
        }

        companyShares.add(new CompanyShares(symbol, amount, sharePrice));
    }

    public void sell(int amount, String symbol) {

        for (CompanyShares company : companyShares) {

            if (company.symbol.equalsIgnoreCase(symbol)) {

                if (company.numberOfShares >= amount) {

                    company.numberOfShares -= amount;
                    company.transactionTime = java.time.LocalDateTime.now();

                } else {

                    System.out.println("Not enough shares available.");
                }

                return;
            }
        }

        System.out.println("Stock not found.");
    }

    public void printReport() {

        System.out.println("\n------ STOCK REPORT ------");

        for (CompanyShares company : companyShares) {

            System.out.println("Symbol : " + company.symbol);
            System.out.println("Shares : " + company.numberOfShares);
            System.out.println("Share Price : " + company.sharePrice);
            System.out.println("Value : " + company.getValue());
            System.out.println("Last Transaction : " + company.transactionTime);
            System.out.println();
        }

        System.out.println("Total Value : " + valueOf());
    }

    public void save(String filename) {

        try {

            FileWriter writer = new FileWriter(filename);

            for (CompanyShares company : companyShares) {

                writer.write(company.symbol + " "
                        + company.numberOfShares + " "
                        + company.sharePrice + "\n");
            }

            writer.close();

            System.out.println("Data saved successfully.");

        } catch (IOException e) {

            System.out.println("Unable to save file.");
        }
    }
}