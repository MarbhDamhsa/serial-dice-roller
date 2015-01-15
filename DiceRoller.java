package diceroller;

import java.util.Arrays;

public class DiceRoller {
    private DicePair[] rollSeries;
    private int[] stats = null;
    
    public DiceRoller( )
    {
        DicePair pair = new DicePair();
        int maxSum = pair.getMaxSum();
        // in order to make subscripts 1 - 12 legal
        stats = new int[ maxSum + 1];

    }
    
    
    public void rollSeries( int seriesLength )
    {
        clearStats();
        populateDice( seriesLength );
        
        
        for ( DicePair pair : rollSeries){
            //roll
            int sum = pair.roll();
            //store stats
            stats[ sum ] = stats[ sum ] + 1;
            
            
            --seriesLength;
        }
        
    }
    
    private void populateDice(int rollCount )
    {
        //Create the array
        rollSeries = new DicePair[ rollCount ];
        //Create individual dice pairs
        int idx = 0;
        for ( ; idx < rollCount ; ++idx ){
            rollSeries[ idx ] = new DicePair();
        }
    }
    
        public void printStats()
    {
        System.out.println();
        System.out.println("Sum\tCount");
        System.out.println("-------\t------");
        int idx = 2;
        for ( ; idx < stats.length; ++idx ){
            
            if ( stats[ idx ] ==0 ){
                continue;
            }
            
            System.out.printf( idx 
                    + "\t" 
                    + stats[ idx ]
                    +"\n");
        }
        
        
    }
    
      private void clearStats()
    {
        Arrays.fill(stats, 0);
    }
    
}//class DiceRoller2
