package com.udemy.section8.sortArray;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Please enter 10 numbers to fit into the array");
        Scanner input = new Scanner(System.in);
        int array[] = new int[10];


        int counter = 0;
        while (counter<10 && input.hasNextInt() )
        {
            array[counter] = input.nextInt();
            ++counter;
        }

        Sort s = new Sort(array);
        s.linearSortDescending();
        System.out.printf(s.returnArrayContent());
    }
}
