// Tom Schneible
// CSE2 Spring2015
// Homework 6 GetIntegers

import java.util.Scanner;

public class GetIntegers {

    public static void main(String[] args) {

// Defines a new scanner.        
    Scanner scanner = new Scanner(System.in);

// Defines all of the varibales will use in our loop.    
    int x = 5;
    int a = 0;
    int sum = 0;

// Prompts the user for input.    
    System.out.println("Please enter 5 non-negative integers.");

// Begins the loop that first checks to see if the input is an integer, then checks to see
// if it is greater than 0.
// After we verify that the number is a vaid integer, the loop saves the number, adds the first
// input to zero and saves this new number as the variable sum. The next numbers are
// subsequently added to sum, and then resaved as sum.
    while(x>0) {
    
        if(!scanner.hasNextInt()){
            System.out.println("Your input must consist of integers.");
            }
            
        a = scanner.nextInt();    
    
        if(a<0) {
        System.out.println("Your integer must be postive.");
            }
     
        sum = sum + a;
        x--;
    }
    System.out.println("The sum of these digits is " + sum);
    }
}