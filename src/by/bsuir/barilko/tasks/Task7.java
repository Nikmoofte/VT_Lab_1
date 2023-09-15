package by.bsuir.barilko.tasks;

import static org.junit.Assert.assertArrayEquals;

import java.math.BigInteger;
import java.util.Arrays;

public class Task7
{
    public static int[] solve(int[] numbers)
    {
        var size = numbers.length;
        int[] result = Arrays.copyOf(numbers, size);

            for (int i = 0; i < size - 1; i++) 
            {
                if(result[i] > result[i + 1])
                {
                    result[i] += result[i + 1];
                    result[i + 1] = result[i] - result[i + 1];
                    result[i] -= result[i + 1];
                    i = Math.max(0, i - 1);
                }
            }
        

        return result;
    }

    public static BigInteger[] solve(BigInteger[] numbers)
    {
        var size = numbers.length;
        BigInteger[] result = Arrays.copyOf(numbers, size);
        for (int j = 0; j < result.length; j++) 
        {
            for (int i = 0; i < size - 1; i++) 
            {
                if(result[i].compareTo(result[i + 1]) == -1)
                {
                    result[i] =  result[i].add(result[i + 1]);
                    result[i + 1] = result[i].subtract(result[i + 1]);
                    result[i] = result[i].subtract(result[i + 1]);
                    i = Math.max(0, i - 1);
                }
            }
        }

        return result;
    }
   
}
