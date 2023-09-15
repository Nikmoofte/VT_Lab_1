package by.bsuir.barilko.tasks;

import java.math.BigInteger;

public class Task5
{
    public static void main(String[] args)
    {
        var res = Task5.solve(new int[]{1, 4, 2, 3, 7, 10, 5, 9, 10});
        System.out.println(res);
    }

    public static int solve(BigInteger[] numbers)
    {
        //Init
        int result = 0;
        int[] M = new int[numbers.length + 1]; // Index of last numbers in sequence with size i 
        M[0] = -1;
        
        //Computing max length of increasing sequence 
        for (int i = 0; i < numbers.length - 1; i++) 
        {
            int lo = 1;
            int hi = result + 1;
            while(lo < hi)
            {
                var mid = lo + (hi - lo) / 2;
                if(numbers[M[mid]].compareTo(numbers[i]) >= 0)
                {
                    hi = mid;
                }
                else 
                {
                    lo = mid + 1;
                }
            }

            var newRes = lo;

            M[newRes] = i;

            result = Math.max(newRes, result);
        }
    
        result = numbers.length - result - 1;

        return result;
    }
    public static int solve(int[] numbers)
    {
        //Init
        int result = 0;
        int[] M = new int[numbers.length + 1]; // Index of last numbers in sequence with size i 
        M[0] = -1;
        
        //Computing max length of increasing sequence 
        for (int i = 0; i < numbers.length - 1; i++) 
        {
            int lo = 1;
            int hi = result + 1;
            while(lo < hi)
            {
                var mid = lo + (hi - lo) / 2;
                if(numbers[M[mid]] >= numbers[i])
                {
                    hi = mid;
                }
                else 
                {
                    lo = mid + 1;
                }
            }

            var newRes = lo;

            M[newRes] = i;

            result = Math.max(newRes, result);
        }

        result = numbers.length - result - 1;

        return result;
    }
}
