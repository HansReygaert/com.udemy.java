package com.udemy.section8;

public class SortAscending
{
    private int[] array;
    private int pivot;

    public SortAscending(int[] array)
    {
        this.array = array;
    }

    public void quickSort()
    {
        pivot = array[array.length/2];


    }
    private void swap(int index1, int index2)
    {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public int[] getArray() {
        return array;
    }
}
