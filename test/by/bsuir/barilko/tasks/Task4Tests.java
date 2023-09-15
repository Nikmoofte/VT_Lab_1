package by.bsuir.barilko.tasks;

import static org.junit.Assert.assertArrayEquals;

import java.math.BigInteger;

import org.junit.Test;

public class Task4Tests {
    @Test
    public void tableTest()
    {
        var res = Task4.solve(new BigInteger[]{new BigInteger("21"), new BigInteger("42"), new BigInteger("324"), new BigInteger("3"), new BigInteger("56"), new BigInteger("23"), new BigInteger("121")});
        Integer[] expected = new Integer[]{3, 5};
        assertArrayEquals(expected, res);
    }

    @Test
    public void Test()
    {
        var res = Task4.solve(new BigInteger[]{new BigInteger("21"), new BigInteger("42"), new BigInteger("324"), new BigInteger("6"), new BigInteger("56"), new BigInteger("24"), new BigInteger("121")});
        Integer[] expected = new Integer[]{};
        assertArrayEquals(expected, res);
    }  
}
