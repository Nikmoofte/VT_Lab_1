package by.bsuir.barilko.tasks;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class Task7Tests {
    @Test
    public void sortedTest()
    {
        var res = Task7.solve(new int[]{1, 2, 3});
        var expected = new int[]{1, 2, 3};
        assertArrayEquals(expected, res);
    }
    
    @Test
    public void unsortedTest()
    {
        int[] in = new int[7];
        
        for (int i = 0; i < in.length; i++) 
        {
            in[i] = (int)(Math.random() * 100);
        }
        var res = Task7.solve(in);
        Arrays.sort(in);
        assertArrayEquals(in, res);
    }
}
