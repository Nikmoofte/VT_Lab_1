package by.bsuir.barilko.tasks;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class Task8Tests {
    @Test
    public void Test1()
    {
        var res = Task8.solve(new double[]{1, 2, 3}, new double[]{1, 2, 3});
        var expected = new int[]{0, 2, 4};
        assertArrayEquals(expected, res);
    }

    @Test
    public void emptyTest()
    {
        var res = Task8.solve(new double[]{}, new double[]{1, 2, 3});
        var expected = new int[]{0, 1, 2};
        assertArrayEquals(expected, res);
    }
    
}
