package by.bsuir.barilko.tasks.Task9;

public class Ball extends Weighty
{
    public Ball(String color, float weight)
    {
        super(weight); 
        this.color = color;
    }
    
    public String getColor() 
    {
        return color;
    }

    private String color;
}
