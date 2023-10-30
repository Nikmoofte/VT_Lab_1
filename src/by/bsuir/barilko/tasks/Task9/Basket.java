package by.bsuir.barilko.tasks.Task9;

import java.util.List;
import java.util.Stack;

public class Basket extends Weighty
{
    public Basket()
    {
        super(baseWeigth);
        inside = new Stack<Weighty>();
    }

    public Basket(List objects)
    {
        super(baseWeigth);
        inside = new Stack();
        for (Object object : objects) 
        {
            if(object instanceof Weighty)
            {
                inside.push((Weighty)object);    
                addWeight(((Weighty)object).getWeight());
            }
        }
    }
    public Basket(Object object)
    {
        super(baseWeigth);
        inside = new Stack();

        if(object instanceof Weighty)
        {
            inside.push((Weighty)object);    
            addWeight(((Weighty)object).getWeight());
        }
    }

    public void put(Weighty object)
    {
        inside.push(object);
        addWeight(((Weighty)object).getWeight());
    }
    public void put(List objects)
    {
        for (Object object : objects) 
        {
            if(object instanceof Weighty)
            {
                inside.push((Weighty)object);    
                addWeight(((Weighty)object).getWeight());
            }  
        }
    }

    public Weighty get()
    {
        return inside.pop();
    }

    public void clear()
    {
        inside.clear();
        setWeight(baseWeigth);
    }

    public Weighty[] getAll()
    {
        Weighty[] res = new Weighty[inside.size()]; 
        inside.toArray(res);
        clear();
        return res;
    }

    private static final float baseWeigth = 10.0f;
    private Stack<Weighty> inside;
}
