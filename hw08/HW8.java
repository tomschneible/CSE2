// Tom Schneible
// CSE2 Spring2015
// Adventure Program

import java.util.Scanner;
public class HW8 {
public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }

    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
// This is the first method that checks the users input to continue the game.
// It saves the users input as a string and then checks to see if the string is
// acceptable input. Any other input exists the game.
// Note the return statement is required to exit the method if the input is accepted
public static String getInput(Scanner scan, String string){
    String a = scan.next();   
    if(a.equals("C")) {
        return("a");
    }
    else if(a.equals("c")) {
        return("a");
    }
    else{
        System.out.println("Yea right LOSER!");
        System.exit(0);
    }
    return("a");
}
// This method does not work the way it should, however I cannot figure out how to make it work.
// For inputs of e, it will always accept 2 inputs and then declare a victory, which should not
// happen. This may be an issue with the randomly generated number, however I have tried changing
// this and it does not fix the problem

// The input of A also does not work perfectly, however this may be because the e input is nested
// inside it.
public static String getInput(Scanner scan, String string, int trial) {
    String b = scan.next();
    if (b.equals("A") || b.equals("a")){
        int c = trial;
    
        while(c>=0){   
        int num = (int)(Math.random()*10);
            if(num==1){
                c--;
                b = scan.next();
                if(b.equals("E") || b.equals("e")){
                    int num2 = (int)(Math.random()*10);
                        if(num2==10){
                            System.out.println("You have escaped!");
                            System.exit(0);
                        }
                    }
            else{
                System.out.println("Executed by the GIANT! Game Over!");
                System.exit(0);
            }
                
        }      
    }
    System.out.println("You have killed the giant!");
    return "a";        
        }    
    else if(b.equals("E") || b.equals("e")){
        b = scan.next();
        int num2 = (int)(Math.random()*10);
            if(num2==10){
                System.out.println("You have escaped!");
                System.exit(0);
        }
    }
    else{
        System.out.println("Executed by the GIANT! Game Over!");
        System.exit(0);
    }
return "a";
}
// This method works as intended. It prompts the user for a box number, and then prints out
// what is in the box
public static String getInput(Scanner scan){
    int box=0;
    box = scan.nextInt();
    switch(box) {
        case (1):
        System.out.println("You find the giant's head in the chest.");
        System.out.println("I wonder how it got there.");
        break;
        
        case (2):
        System.out.println("You find a single coin in the chest.");
        break;
        
        case (3):
        System.out.println("You find a large bag of coins in the chest");
        break;
        
        default:
        System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
    }
return "a";    
}
}

