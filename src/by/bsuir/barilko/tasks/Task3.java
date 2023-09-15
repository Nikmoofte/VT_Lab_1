package by.bsuir.barilko.tasks;

import static java.lang.Math.tan;

public class Task3 
{
    public static double[] solve(double a, double b, double h)
    {
        int size = (int)((b - a) / h);
        double[] result = new double[size + 1];

        int i = 0;
        for(;a <= b; a += h, ++i)
        {
            result[i] = tan(a);
        }

        return result; 
    }
}
