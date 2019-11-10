package com.udemy.encapsulation;
import com.udemy.encapsulation.page.Page;
import com.udemy.encapsulation.toner.Toner;
import com.udemy.encapsulation.toner.TonerCapsule;

import java.util.Queue;

public class Printer
{
    /*
    It will simulate a real computer printer
It should have fields for the toner, level, number of pages printed and
also whether it's a duplex printer (capable of printing on both sides of the paper)
     */

    private Toner toner;
    private int numberOfPages;
    private Queue<Page> pages;
    private Queue<Document> documentsToPrint;

    boolean isDuplex;

    public void printDocument(Document document)
    {

    }
    public void analyzeDocument(Document document)
    {

    }
    private void calculateInkRequirements(Document document)
    {

    }

    public void importPage()
    {

    }
    public void getDocument()
    {

    }
    public void addPaper(int numberOfPages)
    {
        this.numberOfPages = numberOfPages;
    }
}
