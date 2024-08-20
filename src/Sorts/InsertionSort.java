package Sorts;
import java.util.ArrayList;
import java.util.AbstractList;
import java.util.Objects;

import static Sorts.CommonMethods.exch;
import static Sorts.CommonMethods.less;

public class InsertionSort
{

    public static void sort(Comparable[] data)
    {
        for (int i=1; i< data.length; i++)
        {
            for (int j=i; j>=1; j--)
            {
                if (less(data[j], data[j-1]))
                {
                    exch(data, j, j-1);
                }
                else
                {
                    break;
                }
            }
        }

    }

    public static void sort(Object[] data)
    {
        for (int i=1; i< data.length; i++)
        {
            for (int j=i; j>=1; j--)
            {
                if (less((Comparable) data[j], (Comparable) data[j-1]))
                {
                    exch(data, j, j-1);
                }
                else
                {
                    break;
                }
            }
        }

    }

    public static void sort(Comparable[] data, int st, int end)
    {
        for (int i=st+1; i<=end; i++)
        {
            for (int j=i; j>st; j--)
            {
                if (less(data[j], data[j-1]))
                {
                    exch(data, j, j-1);
                }
                else
                {
                    break;
                }
            }
        }
    }

}
