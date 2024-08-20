package Sorts;

import static Sorts.CommonMethods.exch;
import static Sorts.CommonMethods.less;

public class ShellSort
{
    public static void sort(Comparable[] data) {
        int h = 1;
        while (h < data.length / 3) {
            h = 3 * h + 1;
        }

        while (h > 0)
        {
            for (int i = h; i < data.length; i++)
            {
                for (int j = i; j >= h; j -= h)
                {
                    if (less(data[j], data[j - h])) {
                        exch(data, j, j - h);
                    }
                    else
                    {
                        break;
                    }
                }
            }
            h /= 3;
        }
    }

    public static void sort(Comparable[] data, int st, int end) {
        int h = 1;
        while (h < (end-st+1) / 3) {
            h = 3 * h + 1;
        }

        while (h > 0)
        {
            for (int i = h+st; i <= end; i++)
            {
                for (int j = i; j >= h; j -= h)
                {
                    if (less(data[j], data[j - h])) {
                        exch(data, j, j - h);
                    }
                    else
                    {
                        break;
                    }
                }
            }
            h /= 3;
        }
    }
}
