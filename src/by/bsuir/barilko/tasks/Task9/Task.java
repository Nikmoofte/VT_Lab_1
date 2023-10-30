package by.bsuir.barilko.tasks.Task9;

import java.util.Arrays;

public class Task
{
    public static void main(String[] args)
    {
        Basket basket = new Basket();
        basket.put(Arrays.asList(new Weighty[]{new Ball("Blue", 5.0f), new Ball("Blue", 2.0f), new Ball("Red", 1.0f), new Ball("Black", 7.0f)}));

        System.out.println(findWeight(basket) + " " + countBlue(basket));
    }

    public static float findWeight(Basket basket)
    {
        var weight = basket.getWeight();
        basket.clear();
        
        return weight - basket.getWeight();
    }
    public static int countBlue(Basket basket)
    {
        int res = 0;
        var objects = basket.getAll();

        for(var object : objects)
        {
            if(object instanceof Ball)
            {
                res += ((Ball)object).getColor() == "Blue" ? 1 : 0;
            }
        }
        
        return res;
    }
}
