/**
 * Rolls the dice 1000 times and checks for any boxcars (both dice roll a 6)
 *
 * @author John Villante
 * @version 1.25.2022
 */
public class DiceRoll
{
    private PairOfDice pair;
    public DiceRoll()
    {
        pair = new PairOfDice();
        int boxCar = 0; //Number of box cars detected
        for(int i = 0; i <=1000; i++) //i = number of times a dice is rolled
        {
            pair.roll();
            int die1 = pair.getDie1FaceValue();
            int die2 = pair.getDie2FaceValue();
            if(die1==6||die2==6)//if both dice have a face value of 6 then boxCar will be increased by 1
            {
               boxCar++;    
            }
        }
        System.out.println("The number of times there is a box car (two sixes) present in a pair of dice rolled 1000 times is: " +boxCar);
    }
}