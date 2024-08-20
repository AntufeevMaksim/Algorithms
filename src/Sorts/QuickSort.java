package Sorts;

import java.util.Random;

import static Sorts.CommonMethods.*;

public class QuickSort
{
    public static void sort(Comparable[] data)
    {
        shuffling(data);
        sort(data, 0, data.length-1);
    }

    private static void sort(Comparable[] data, int st, int end)
    {
        if (end-st+1<=100)
        {
            ShellSort.sort(data, st, end);
            return;
        }
        int lt = st;
        int i = st;
        int gt = end;

        Comparable v = data[lt];
        while (i <= gt)
        {
            if (less(data[i], v))
            {
                exch(data, i++, lt++);
            }
            else if (data[i].equals(v))
            {
                i++;
            }
            else
            {
                exch(data, i, gt--);
            }
        }

        sort(data, st, lt-1);
        sort(data, gt+1, end);
    }

//    private static int[] partition(Comparable[] data, int st, int end)
//    {
//        Comparable sep = data[st];
//
//        int i = st;
//        int j = end+1;
//        while (true)
//        {
//            while (i<end && lessOrEqual(data[++i], sep)) {}
//            while (j>st && lessOrEqual(sep, data[--j])) {}
//
//            if (j<=i) {break;}
//
//            exch(data, i, j);
//        }
//        exch(data, st, j);
//
//        return j;
//
//
//    }



    private static void shuffling(Comparable[] data)
    {
        Random random = new Random();
        int j = -1;
        for (int i = 0; i<data.length; i++)
        {
            j = random.nextInt(i+1);
            exch(data, i, j);
        }
    }

//    public static Comparable selection(Comparable[] data, int i)
//    {
//        shuffling(data);
//        i = i-1;
//        int j = 0;
//        int st = 0;
//        int end = data.length-1;
//        while (true)
//        {
//            j = partition(data, st, end);
//            if (i == j) { return data[j];}
//            else if (i < j) { end = j-1;}
//            else if (i > j) { st = j+1;}
//
//
//        }
//    }
    
    
}
