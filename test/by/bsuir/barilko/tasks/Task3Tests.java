package by.bsuir.barilko.tasks;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static java.lang.Math.PI;;


public class Task3Tests {
    @Test
    public void tableTest()
    {
        var arr = Task3.solve(0, 2*PI, PI); 
        double[] expected = new double[]{0, 0, 0};
        assertArrayEquals(expected, arr, 0.0001);
    }    

    @Test
    public void tableTest2()
    {
        var arr = Task3.solve(PI / 4, 2*PI, PI); 
        double[] expected = new double[]{1, 1};
        assertArrayEquals(expected, arr, 0.0001);
    }

    @Test
    public void exeptionTest()
    {
        boolean exception = false;
        try
        {
            Task3.solve(1, 10, -1); 
        }
        catch(Exception e)
        {
            exception = true;
        }
        
        assert(exception);
    }   
}
