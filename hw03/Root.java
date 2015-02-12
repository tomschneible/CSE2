// Tom Schneible
// CSE 002 Spring2015
// HW 03

// Imports Scanner
import java.util.Scanner ;

// Defines class
    public class Root {

// Defines main method        
        public static void main(String[] args) { ;

// Establishes new Scanner
            
            Scanner myScanner;
            myScanner = new Scanner(System.in) ;
// Asks user for input.

            System.out.println("Enter a number that you would like the cube root of.") ;

// Saves number as a double             
            double number = myScanner.nextDouble() ;

// Begins process of improving guess to get cube root.            
            double guess = number/3 ;
            
            double guessB = (guess*guess*guess+number)/(3*guess*guess) ;
            
            double guessC = (2*guessB*guessB*guessB+number)/(3*guessB*guessB) ;
            
            double guessD = (2*guessC*guessC*guessC+number)/(3*guessC*guessC) ;
            
            double guessE = (2*guessD*guessD*guessD+number)/(3*guessD*guessD) ;
            
            double guessF = (2*guessE*guessE*guessE+number)/(3*guessE*guessE) ;
            
// Prints the estimated cube root and shows the user the calculation.           
            System.out.println("The cube root is " + guessF + "." ) ;
            System.out.println(guessF + "*" + guessF + "*" + guessF + " is " + guessF*guessF*guessF + ".") ;
            
        }
    }
