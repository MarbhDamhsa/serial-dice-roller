package diceroller;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        int dieSides = 6;
        int seriesLength = 20;
        DicePair pair = new DicePair( dieSides );
        DiceRoller roller = new DiceRoller();
        int total = pair.roll();
        System.out.println("Welcome to the Dice Roll Stats Calculator!");
        //System.out.println("total " + total);
        Scanner ans = new Scanner(System.in);
        Scanner rs = new Scanner(System.in);
        
        Menu menu = new Menu();
        menu.select( "1. Change Die Side Count");
        menu.select( "2. Roll Dice");
        menu.select( "3. Serial Dice Roll");
        menu.select( "4. Quit");
        
        int choice = Menu.DEFAULT;
        while( choice != Menu.QUIT){
            choice = menu.getUserChoice();
            switch( choice ){
                case Menu.CHANGE_SIDES:
                    System.out.println("The default sides to the dice are set to 6");
                    System.out.println("What would you like to change that to?");
                    dieSides = ans.nextInt();
                    pair = new DicePair( dieSides );
                    break;
                
                
                case Menu.ROLL_DICE:
                    total = pair.roll();
                    System.out.print( "Your total is: " + total );
                    if (total == 7){
                        System.out.println(":  Craps!");
                    } else if (total == 2){
                        System.out.println(":  Snake Eyes!");
                    } else if (total == 12){
                        System.out.println(":  Box Cars!");
                    } else {
                        System.out.println();
                    }
                    System.out.println();
                    break;
                
                case Menu.SERIAL_ROLL:
                    System.out.println( "How many times do you want to roll? (default is 20)");
                    seriesLength = rs.nextInt();
                    roller.rollSeries( seriesLength );
                    roller.printStats();
                    System.out.println();
                    break;
                    
                case Menu.QUIT:
                    System.out.println("Goodbye!");
                    break;
            }
            
        }//while
    }//main
    
}//MainApp
