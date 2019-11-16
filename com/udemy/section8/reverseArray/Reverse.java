package com.udemy.section8.reverseArray;

public class Reverse
{
    private int[] array;

    public Reverse(int[] array)
    {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void ReverseArray()
    {
        int j = array.length-1;
        for (int i = 0; i < j; i++)
        {
            swapIndexes(i,j);

            j--;
        }
    }
    private void swapIndexes(int index1, int index2)
    {
        int temp = 0;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    @Override
    public String toString()
    {
        String s = "";
        for (int i : array)
        {
            s += "[" + i + "] ";
        }
        return s;
    }
}
