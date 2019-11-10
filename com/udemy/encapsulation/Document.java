package com.udemy.encapsulation;

import java.util.ArrayList;

public class Document
{
    int safeZone;
    ArrayList<ArrayList<RGB>>documentPrintArea;

    public Document(ArrayList<ArrayList<RGB>> documentPrintArea) {
        this.documentPrintArea = documentPrintArea;
    }
}
