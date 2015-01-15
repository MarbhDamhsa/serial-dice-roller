
package diceroller;

public class Die {
    
    //instance variables
    static final int DEFAULT_SIDE_COUNT = 6;
    private int dieSides;
    private int faceValue;
       
    //constructors
    public Die()
    {
        dieSides = DEFAULT_SIDE_COUNT;
        faceValue = roll();
    }
    
     public Die( int dieSides )
    {
        this.dieSides = dieSides;
        roll();
    }
    
    //user wants to set face value
    public Die( int dieSideCount, int faceValue )
    {
        this.dieSides = dieSides;
        //verify that valid
        this.faceValue = faceValue;
    }
    
    public int getSideCount()
    {
        return dieSides;
    }
    
    public int roll()
    {
        faceValue = 1 + (int) (Math.random() * getSideCount() );
        return faceValue;
    }
}//class
