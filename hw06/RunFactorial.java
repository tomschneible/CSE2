// Tom Schneible
// CSE2 Spring2015
// HW 06 Run Factorial

import java.util.Scanner;

public class RunFactorial {
    
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
  
  // Defines the variables that we will store values in to get our final number.
  // It is important for z to be a long because it will eventually become a number
  // larger than the maximum value of an int.
        int x = 1;
        int y = 1;
        long z = 1;
        
  // Prompts the user to input a number and then checks to see if it is 
  // an integer within the required range.
    System.out.println("Enter a number between 9 and 16.");
      if(!scanner.hasNextInt()){
            System.out.println("Your input must consist of integers.");
            System.exit(0);
        }
        
        y = scanner.nextInt();
        if(y>16) {
            System.out.println("Your number cannot be greater than 16.");
            System.exit(0);
        }
        
        if(y<9) {
            System.out.println("Your number cannot be less than 9.");
            System.exit(0);
        }
        
// Defines a variale for the counter.        
        long j = 1;

// This loop takes a number (A), saves it, adds one to A to make a new number (B),
// then multiplies A and B, and finally saves this new value as A. This loop begins at 1 and
// ends at the number the user inputs.
      while(j<=y) {
        z *= j;
        j++;
    } 
    
    System.out.println(y + "! is: " + z);
        
    }
}