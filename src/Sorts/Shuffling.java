package Sorts;

import java.util.Random;

import static Sorts.CommonMethods.exch;

public class Shuffling
{
    public static void shuffle(Object[] data)
    {
        Random random = new Random();

        for (int i=0; i< data.length; i++)
        {
            int j = random.nextInt(i+1);
            exch(data, i, j);
        }
    }
}
