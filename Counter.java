public class Counter
{
    private int counter = 0;
    private int counterID = 0;
    static int nCounters = 0;
    public Counter(int counter)
    {
        this.counter= counter;
        nCounters++;
        counterID = nCounters;
    }
    
    public void increment()
    {
        counter++;
    }
    
    public void decrement()
    {
        counter--;
    }
    
    public int getValue()
    {
        return counter;
    }
    
    public int getCounterID()
    {
        return counterID;
    }
    
}