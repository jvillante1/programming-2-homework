
/**
 * Prints all the verses to the song "The Twelve Days of Christmas".
 *
 * @author John Villante
 * @version 1.25.2022
 */
public class TwelveDays
{
    public static void main(String[] args)
    {
        for(int day = 1; day <= 12; day++)
        {
            System.out.println("On the ");
            switch(day)
            {
                case 1: System.out.print("1st");
                break;
                case 2: System.out.print("2nd");
                break;
                case 3: System.out.print("3rd");
                break;
                default: System.out.print(day+"th");
            }
            System.out.print(" day of Christmas, my true love gave to me,\n");
            switch(day)
            {
                case 12: System.out.println("Twelve drummers drumming,");
                case 11: System.out.println("Eleven pipers piping,");
                case 10: System.out.println("Ten lords a-leaping,");
                case 9: System.out.println("Nine ladies dancing,");
                case 8: System.out.println("Eight maids a-milking,");
                case 7: System.out.println("Seven swans a-swimming,");
                case 6: System.out.println("Six geese a-laying,");
                case 5: System.out.println("Five golden rings,");
                case 4: System.out.println("Four calling birds,");
                case 3: System.out.println("Three French hens,");
                case 2: System.out.println("Two turtle doves, and");
                case 1: System.out.println("A partridge in a pear tree.");
            }
            System.out.println();
        }
    }
}