/**
 * Uses nested for loops to make star patterns
 *
 * @author John Villante
 * @version 1.25.2022
 */
public class Stars
{
    public static void main(String[] args)
    {
        final int MAX_ROWS = 10;
        
        for(int row = 1; row <= MAX_ROWS; row++)
        {
            for(int star = 1; star <=row; star++)
                System.out.print("*");
            System.out.println();
        }
    }
}
