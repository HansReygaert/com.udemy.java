package com.udemy.section8.autoboxingUnboxing;

import java.util.ArrayList;
import java.util.List;

public class Branch {
    private String name;
    private List<Customer> customers = new ArrayList<>();

    public Branch(String name, List<Customer> existingCustomersInBranch) {
        this.name = name;
        this.customers = existingCustomersInBranch;
    }

    public Branch(String newBranchName) {
        this.name = newBranchName;
        customers = new ArrayList<>();
    }

    public void addNewCustomer(Customer newCustomer, double initialTransaction)
    {
        newCustomer.setCustomersBranch(this);
        newCustomer.addTransaction(initialTransaction);
        customers.add(newCustomer);
    }
    public String getName() {
        return name;
    }
    public void addNewCustomer(Customer newCustomer)
    {
        addNewCustomer(newCustomer,0);
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
