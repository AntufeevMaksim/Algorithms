package Sorts;

class CommonMethods
{
    public static boolean less(Comparable a, Comparable b)
    {
        return a.compareTo(b) == -1;
    }



    public static boolean lessOrEqual(Comparable a, Comparable b)
    {
        return a.compareTo(b) <= 0;
    }

    public static void exch(Object[] data, int i, int j)
    {
        Object swap = data[i];
        data[i] = data[j];
        data[j] = swap;
    }
}
