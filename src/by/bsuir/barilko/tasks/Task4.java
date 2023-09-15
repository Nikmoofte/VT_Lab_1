package by.bsuir.barilko.tasks;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class Task4 
{
    public static Integer[] solve(BigInteger[] numbers)
    {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < numbers.length; ++i)
        {
            var number = numbers[i];
            if(number.isProbablePrime(1))
            {
                list.add(i);
            }
        }
        Integer[] res = new Integer[list.size()];
        list.toArray(res); 
        return res;
    }
}
