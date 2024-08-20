package Tasks;

import Sorts.ShellSort;

public class Intersection
{
    public static int CountOfIntersections(Comparable[] data1, Comparable[] data2)
    {
        int total_count = 0;
        Comparable[] a = data1.clone();
        Comparable[] b = data2.clone();
        ShellSort.sort(a);
        ShellSort.sort(b);

        int j = 0;
        for (int i=0; i<a.length; i++)
        {
            for (; j<b.length;j++)
            {
                if (a[i].compareTo(b[j]) == 0)
                {
                    total_count += 1;
                    break;
                } else if (a[i].compareTo(b[j]) == -1)
                {
                    break;
                }
            }
        }
        return total_count;
    }
}
