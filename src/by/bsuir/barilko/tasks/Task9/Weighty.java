package by.bsuir.barilko.tasks.Task9;

public class Weighty 
{
    Weighty(float weight)
    {
        this.weight = weight;
    }

    float getWeight()
    {
        return weight;
    }
    protected void setWeight(float newWeight)
    {
        weight = newWeight;
    }
    protected void addWeight(float weight)
    {
        this.weight += weight;
    }
    private float weight;
}
