package diceroller;

public class DicePair {

    //data fields
    private Die diceOne;
    private Die diceTwo;
    
    
    
    //constructors
    
    public DicePair()
    {
        diceOne = new Die( );
        diceTwo = new Die( );
    }
    //construct a pair of equivalent dice
    public DicePair(int dieSides )
    {
     
        diceOne = new Die( dieSides );
        diceTwo = new Die( dieSides );
        
    }
    
    //construct a pair of two different dice
    public DicePair(int dieSides, int dieSides2)
    {
        diceOne = new Die(dieSides);
        diceTwo = new Die(dieSides2);
    }
    
    //operations
    
    public int getMinSum()
    {
        return 2;
    }
    
    public int getMaxSum()
    {
        return diceOne.getSideCount() + diceTwo.getSideCount();
    }
    
    
    public int roll()
    {
        int total = diceOne.roll() + diceTwo.roll();
        return total;
    }
    
    
    public Die getDiceObject( int index )
    {
        if ( index == 1){
            return diceOne;
           }
        return diceTwo;
    }
}
