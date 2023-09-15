package by.bsuir.barilko.tasks;

import static java.lang.Math.sin;
import static java.lang.Math.abs;

public class Task1
{
    public static double solve(double x, double y)
    {
        double result = 0;
        double temp = sin(x + y); 
        result = 1 + temp * temp;
        temp = 2 + abs(x - 2 * x / (1 + x * x * y * y));
        result /= temp;
        result += x;
        return result;
    }
}
