// Tom Schneible
// CSE 002 Spring2015
// HW03

import java.util.Scanner ;

    public class FourDigits {
        
        public static void main(String[] args) { 
            
            Scanner myScanner;
            myScanner = new Scanner(System.in) ;
            
            System.out.println("Enter a number with any number of decimal places and I will print the first four.") ;
            
            double number = myScanner.nextDouble() ;
            
            int numberX = (int)(number*10000) ;
            
            int number4 = (int)numberX % 10 ;
            
            int numberY = (int)numberX/10 ;
            
            int number3 = (int)numberY % 10 ;
            
            int numberZ = (int)numberY/10 ;
            
            int number2 = (int)numberZ % 10 ;
            
            int numberA = (int)numberZ/10 ;
            
            int number1 = (int)numberA % 10 ;
            
            System.out.println("The four digits are " + (int)number1 +""+ (int)number2 +""+ (int)number3 +"" +""+number4+ ".") ;
            
        }      
    }