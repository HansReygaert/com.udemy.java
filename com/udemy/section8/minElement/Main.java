package com.udemy.section8.minElement;

public class Main
{
    public static void main(String[] args) {
        int[] testArray = {15,3,9,80,1,7,4};
        Minimum m = new Minimum(testArray);
        System.out.println(m.getMinimumElement());

    }
}
