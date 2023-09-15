package by.bsuir.barilko.tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task1Tests {
    @Test
    public void SmallTest()
    {
        assertEquals(Task1.solve(1, 1), 1.913410, 0.00001);
    }

    @Test
    public void MediumTest()
    {
        assertEquals(Task1.solve(73, 92), 73.026607, 0.00001);
    }

    @Test
    public void BigTest()
    {
        assertEquals(Task1.solve(3242.233, 852783424.3232), 3242.2334425, 0.00001);
    }   

    @Test
    public void NegTest()
    {
        assertEquals(Task1.solve(-3242.233, -852783424.3232), -3242.2325574, 0.00001);
    }   

    @Test
    public void InfTest()
    {
        assertEquals(Task1.solve(999999999999999999999999999999999999999999999999999999999999999999999999999999.0, 852783424.3232), 1.0E78, 0.01);
    }   
}
