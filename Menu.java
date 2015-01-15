package diceroller;

import java.util.Scanner;

public class Menu {
    public static final int DEFAULT = 0;
    public static final int CHANGE_SIDES = 1;
    public static final int ROLL_DICE = 2;
    public static final int SERIAL_ROLL = 3;
    public static final int QUIT = 4;
    
    
    private Scanner sc;
    private int choice;
    private String sChoices;
    
    public Menu(){
        sc = new Scanner( System.in );
        sChoices = "Please choose from the following:\n";
        choice = DEFAULT;
    }
    
    public void select( String aChoice){
        sChoices += aChoice;
        sChoices += "\n";
    }
    
    public int getUserChoice(){
        System.out.print( sChoices );
        System.out.print( "---->");
        //choice = sc.nextInt();
        
        try {
                choice = sc.nextInt();
                if (choice < 4){
                    return choice;
                }
            } catch (java.util.InputMismatchException ex) {
                sc.next();
                System.out.println("Invalid input. Please try again");
            }
        return choice;
    }
    
    
}
