package com.udemy.section8.autoboxingUnboxing;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Branch> branches = new ArrayList<>();

    public void addNewBranch(Branch newBranch)
    {
        branches.add(newBranch);
    }
    public void addNewCustomerToBranch(Branch newBranch, Customer newCustomer,double initialTransaction)
    {
        branches.add(newBranch);
        newCustomer.setCustomersBranch(newBranch);
        newCustomer.addTransaction(initialTransaction);
    }
    public void addNewCustomerToBranch(Branch newBranch, Customer newCustomer)
    {
        addNewCustomerToBranch(newBranch,newCustomer,0);
    }
    public void addTransactionToCustomerOfBranch(Customer customer, double transaction)
    {
        customer.addTransaction(transaction);
    }
    public void printAllCustomersFromBranch(Branch branch, boolean transactionsIncluded)
    {
        StringBuilder printCustomer = new StringBuilder();
        printCustomer.append("Customers from branch " + branch.getName() + ":\n");
        for (Customer c : branch.getCustomers())
        {
            printCustomer.append( c.getName() + "\n");
            if (transactionsIncluded)
            {
                printCustomer.append(c.getTransactions());
            }
        }
        printCustomer.append("************************");
        System.out.println(printCustomer.toString());
    }
}
