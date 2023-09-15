package by.bsuir.barilko.tasks;


public class Task6
{
    public static int[][] solve(int[] numbers)
    {
        var size = numbers.length;
        int[][] result = new int[size][size];

        for (int i = 0; i < result.length; i++) 
        {
            int indx = i;
            for (int j = 0; j < result.length; j++)
            {
                result[i][j] = numbers[indx++];
                if(indx >= size)
                {
                    indx = 0;
                }
            }
        }
        
        return result;
    }
   
}
