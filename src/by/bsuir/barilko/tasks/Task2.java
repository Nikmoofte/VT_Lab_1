package by.bsuir.barilko.tasks;

import static java.lang.Math.abs;

public class Task2 {
    public static boolean solve(double x, double y)
    {
        boolean res = false;
        if(y <= 0 && y >= minY)
        {
            res = abs(x) <= negativeXBoundaries;
        }
        else if(y > 0 && y <= maxY)
        {
            res = abs(x) <= positiveXBoundaries;
        }
        return res;
    }


    private static double maxY = 5.0;
    private static double minY = -3.0;
    private static double positiveXBoundaries = 4.0;
    private static double negativeXBoundaries = 5.0;

}
