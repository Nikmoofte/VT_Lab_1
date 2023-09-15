package by.bsuir.barilko.tasks;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class Task2Tests {
    @Test
    public void zeroTest()
    {
        assertTrue(Task2.solve(0, 0));
    }
    @Test
    public void positiveTest()
    {
        assertTrue(Task2.solve(3, 3));
    }
    @Test
    public void negtiveTest()
    {
        assertTrue(Task2.solve(-4, -2));
    }
    @Test
    public void borderTest()
    {
        assertTrue(Task2.solve(-5, -3));
    }
    @Test
    public void falseTest()
    {
        assertFalse(Task2.solve(-10, -34));
    }

    
}
