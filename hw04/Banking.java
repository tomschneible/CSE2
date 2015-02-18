// Tom Schneible
// CSE2 Spring2015
// HW 04

// Importing Scanner utility
import java.util.Scanner;

// Defines main class
public class Banking {

// Defines mains class    
    public static void main(String[] args) {

// Creates new Scanner        
        Scanner myScanner = new Scanner(System.in);
        
// Creates a random number and saves it as an integer        
        int A =(int)(Math.random() * 5000 + 1000);

// Asks the user which part of the program they would like to utilize.        
        System.out.println("Would you like to Deposit, Withdraw, or View your Balance?");
        System.out.println("Enter either: Deposit, Withdraw, or Balance");

// Saves the users input.        
        String B = myScanner.next();

// Begins process for when user selects Deposit.
        if(B.equals("Deposit")) {
            System.out.println("How much would you like to deposit?");
            
            int deposit = myScanner.nextInt();
            
            System.out.println("Your balance is $" +( A + deposit) + "." );
            
        }
// Begins process for when user selects Withdraw.
         else if(B.equals("Withdraw")) {
             System.out.println("Your balance is $" + A + ".");
             System.out.println("How much would you like to withdraw?");
             
             int withdraw = myScanner.nextInt();
            // Prints the users balance with the withdrawl amount removed.
             if(withdraw<=A) {
                 System.out.println("Your balance is $" + (A - withdraw) + ".");
                }
            // Does not allow user to withdraw funds if they request an amount
            // greater than what is in their account
             else if(withdraw>A) {
                 System.out.println("You have insufficient funds to perform this transaction.");
                }
            }
        
// Begins process for when user selects Balance.        
        else if(B.equals("Balance")) {
            System.out.println("Your balance is $" + A + ".");
                }
    }

}

