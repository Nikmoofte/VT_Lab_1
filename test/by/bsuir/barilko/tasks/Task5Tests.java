package by.bsuir.barilko.tasks;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class Task5Tests {
    @Test
    public void tableTest()
    {
        var res = Task5.solve(new BigInteger[]{new BigInteger("21"), new BigInteger("56"), new BigInteger("42"), new BigInteger("324")});
        assertEquals(1, res);
    }
    
    @Test
    public void tableTest2()
    {
        var res = Task5.solve(new int[]{1, 4, 2, 3, 7, 10, 5, 9, 10});
        assertEquals(3, res);
    }

}
