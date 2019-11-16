package com.udemy.section8.reverseArray;

public class Main
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Reverse r = new Reverse(arr);
        r.ReverseArray();

        System.out.println(r.toString());
    }
}
