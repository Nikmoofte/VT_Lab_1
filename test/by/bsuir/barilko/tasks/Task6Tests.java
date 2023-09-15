package by.bsuir.barilko.tasks;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Task6Tests {
    @Test
    public void tableTest()
    {
        var res = Task6.solve(new int[]{1, 2, 3});
        var expected = new int[][]{{1, 2, 3},{2, 3, 1},{3, 1, 2}};
        assertArrayEquals(expected, res);
    }
}
