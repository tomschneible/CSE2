// Tom Schneible
// CSE 002 Spring2015
// HW03

// Imports scanner utility
import java.util.Scanner ;

// Defines the public class
    public class FourDigits {

//Defines the main method
        public static void main(String[] args) { 

// Establishes a new scanner            
            Scanner myScanner;
            myScanner = new Scanner(System.in) ;

// Asks the user to input the desired number.
            System.out.println("Enter a number with any number of decimal places and I will print the first four.") ;


// Saves the number the user inputs as a double            
            double number = myScanner.nextDouble() ;
 
// Here we begin the process of extracting each digit that we would like to print.
// Number's X,Y,Z and A are filer numbers that help to transition between the digit place.
// We cast as integers to remove the decimal places and leave only the digits we need
            int numberX = (int)(number*10000) ;
            
            int number4 = (int)numberX % 10 ;
            
            int numberY = (int)numberX/10 ;
            
            int number3 = (int)numberY % 10 ;
            
            int numberZ = (int)numberY/10 ;
            
            int number2 = (int)numberZ % 10 ;
            
            int numberA = (int)numberZ/10 ;
            
            int number1 = (int)numberA % 10 ;

// This prints the numbers required.            
            System.out.println("The four digits are " + (int)number1 +""+ (int)number2 +""+ (int)number3 +"" +""+number4+ ".") ;
            
        }      
    }