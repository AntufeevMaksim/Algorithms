package Sorts;

import static Sorts.CommonMethods.less;
import static Sorts.CommonMethods.lessOrEqual;

public class MergeSort
{
    private static final int    CUTOFF = 7;

    public static void sort(Comparable[] data)
    {
        Comparable[] buf = new Comparable[data.length];
        sort(0, data.length-1, data, buf);
    }

    public static void bottomUpSort(Comparable[] data)
    {
        Comparable[] buf = new Comparable[data.length];
        int mid;
        int end;
        for (int h=2; h<data.length*2; h*=2) {
            for (int st = 0; st < data.length; st += h) {
                end = Math.min(st + h - 1, data.length - 1);
                mid = st + (h - 1) / 2;
                merge(st, end, mid, data, buf);
            }
        }
//        int N = data.length;
//        Comparable[] aux = new Comparable[N];
//        for (int sz = 1; sz < N; sz = sz + sz)
//            for (int lo = 0; lo < N - sz; lo += sz + sz)
//                merge(lo, Math.min(lo + sz + sz - 1, N - 1), lo + sz - 1, data, aux);
    }
    private static void sort(int st, int end, Comparable[] data, Comparable[] buf)
    {
        if ((end-st+1) <= CUTOFF)
        {
            InsertionSort.sort(data, st, end);
            return;
        }
        int mid = st + (end-st)/2;
        sort(st, mid, data, buf);
        sort(mid+1, end, data, buf);
        if (lessOrEqual(data[mid], data[mid+1])) // if already sorted
        {
            return;
        }
        merge(st, end, mid, data, buf);
    }

    private static void merge(int st, int end, int mid, Comparable[] data, Comparable[] buf)
    {
        for (int i=st; i<=end; i++)
        {
            buf[i] = data[i];
        }

        int i = st;
        int j = mid+1;
        for (int k=st; k<=end; k++)
        {
            if (i>mid) {data[k] = buf[j++];}
            else if (j>end) {data[k] = buf[i++];}
            else if (less(buf[i], buf[j])) {data[k] = buf[i++];}
            else if (less(buf[j], buf[i])) {data[k] = buf[j++];}
            else {data[k] = buf[i++];}
        }
    }
    public static void mergeEffectiveMemory(int st, int end, int mid, Comparable[] data)
    {
        Comparable[] buf = new Comparable[mid-st+1];
        for (int i = 0; i<=mid-st; i++)
        {
            buf[i] = data[st+i];
        }

        int i = 0;
        int j = mid + 1;

        int k=st;
        for (; k<=mid; k++)
        {
            if (i == buf.length || j > end) {break;}

            if (less(buf[i], data[j])) {data[k] = buf[i++];}
            else if (less(data[j], buf[i])) {data[k] = data[j++];}
            else {data[k] = buf[i++];}
        }

        for (int n=mid+1; n<j; n++)
        {
            buf[n-(mid+1)] = data[n];
        }

        int middle = j-(mid+1);

        i = 0;
        j = j-(mid+1);
        for (; k<=end; k++)
        {
            if (i == middle) {data[k] = buf[j++];}
            else if (j == buf.length-1) {data[k] = buf[i++];}

            else if  (less(buf[i], buf[j])) {data[k] = buf[i++];}
            else if (less(buf[j], buf[i])) {data[k] = data[j++];}
            else {data[k] = buf[i++];}
        }
    }
}
