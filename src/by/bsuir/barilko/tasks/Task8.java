package by.bsuir.barilko.tasks;

import java.util.Arrays;

public class Task8 {
    public static int[] solve(double[] a, double[] b)
    {
        int[] result = new int[b.length];
        for(int i = 0; i < b.length; ++i)
        {
            var searchRes = Arrays.binarySearch(a, b[i]);
            if(searchRes < 0)
            {
                result[i] = -(searchRes + 1) + i;
            }
            else
            {
                result[i] = searchRes + i;
            }
        }
        
        return result;
    } 
}
