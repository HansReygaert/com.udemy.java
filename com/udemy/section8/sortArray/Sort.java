package com.udemy.section8.sortArray;

public class Sort
{
    int[] array;

    public Sort(int[] array)
    {
        this.array = array;
    }

    public void linearSortDescending()
    {
        for (int i = 0; i<array.length;i++)
        {
            int toCompare = array[i];
            for (int j = 0; j<array.length;j++)
            {
                if (array[i] > array[j])
                {
                    swap(i,j);
                }
            }
        }
    }
    private void swap(int index1, int index2)
    {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public String returnArrayContent()
    {
        String toReturn = "";
        for(int i = 0; i<array.length;i++)
        {
            toReturn += array[i] + ", ";
        }
        return toReturn;
    }
}
