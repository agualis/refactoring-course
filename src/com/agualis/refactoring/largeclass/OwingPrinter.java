package com.agualis.refactoring.largeclass;

import java.util.List;

public class OwingPrinter {

    private String name;

    public OwingPrinter(String name) {
        this.name = name;
    }

    void printOwing(List<Order> orders) {
        printBanner();
        double outstanding = calculateOutstanding(orders);
        printDetails(outstanding);
    }

    private void printDetails(double outstanding) {
        printLine("name:" + name);
        printLine("amount: " + outstanding);
    }

    private double calculateOutstanding(List<Order> orders) {
        double outstanding = 0.0;
        for (Order order : orders) {
            outstanding += order.getAmount();
        }
        return outstanding;
    }

    private void printBanner() {
        printLine("**************************");
        printLine("***** Customer Owes ******");
        printLine("**************************");
    }

    protected void printLine(String line) {
        System.out.println(line);
    }
}
