package com.udemy.section8.autoboxingUnboxing;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Double> transactions = new ArrayList<>();
    private Branch customersBranch;

    public void setCustomersBranch(Branch customersBranch) {
        this.customersBranch = customersBranch;
    }

    public Branch getCustomersBranch() {
        return customersBranch;
    }

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void addTransaction(Double value)
    {
        transactions.add(value);
    }
    public void addTransaction(double value)
    {
        addTransaction(Double.valueOf(value));
    }
    public String getTransactions()
    {
        StringBuilder transactionList = new StringBuilder();
        for (Double transaction : transactions)
        {
            transactionList.append(transaction.doubleValue() + "\n");
        }
        return transactionList.toString();
    }
}
