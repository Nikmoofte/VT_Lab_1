package by.bsuir.barilko.tasks;

import by.bsuir.barilko.tasks.Task9.*;

import java.util.Arrays;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Task9Tests {
    @Test
    public void WeightTest()
    {
        Basket basket = new Basket();
        basket.put(Arrays.asList(new Weighty[]{new Ball("Blue", 5.0f), new Ball("Blue", 2.0f), new Ball("Red", 1.0f), new Ball("Black", 7.0f)}));
        var res = Task.findWeight(basket);
        assertEquals(res, 15.0f, 0.01);
    }
    @Test
    public void ColorCountTest()
    {
        Basket basket = new Basket();
        basket.put(Arrays.asList(new Weighty[]{new Ball("Blue", 5.0f), new Ball("Blue", 2.0f), new Ball("Red", 1.0f), new Ball("Black", 7.0f)}));
        var res = Task.countBlue(basket);
        assertEquals(res, 2);
    }

    
}