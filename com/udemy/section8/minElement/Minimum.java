package com.udemy.section8.minElement;

public class Minimum {
    private int[] array;

    public Minimum(int[] array)
    {
        this.array = array;
    }

    public int getMinimumElement()
    {
        int smallestElement = array[0];
        for (int i = 0; i < array.length;i++)
        {
            if (smallestElement > array[i])
            {
                smallestElement = array[i];
            }
        }
        return  smallestElement;
    }
}
