// Tom Schneible
// CSE2 Spring 2015
// Waves

import java.util.Scanner;

public class waves {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner( System.in );
        int a = 0;
        
        System.out.println("Enter a number 1-30 inclusive.");
      // Checks to see if input is an integer.  
        if(!scanner.hasNextInt()){
            System.out.println("Your input must consist of integers.");
            System.exit(0);
            }
     
        a = scanner.nextInt();
        int c = a;
       // These two if statements verify if the number inputted is in
       // the right range.
        if(a>30) {
            System.out.println("Your number is too large, please try again.");
            System.exit(0);
        }
        
        if(a<1) {
            System.out.println("Your number is too small, please try again");
            System.exit(0);
        }
        
        
        System.out.println("FOR LOOP:");
       
       // We have a loop here that begins a counter at 1, adds 1 to the counter each time
       // the loop runs, and then stops when the loop is equal to the number the user
       // has inputed from above.
        for(int x = 1; x<=a; x++) {
       
       // We mod our input by two to differentiate between even and odd numbers. 
        int b = x%2;
       
       // When the modded number is equal to 0, we have an even number and run this
       // loop which prints the numbers in ascending order.
        if(b==0){
            
            for(int counter = 1; counter <= x; counter++) {
                for( int counter2 =0; counter2 < counter; counter2++) {
                 System.out.print("" + x); 
                    
                }
                
               System.out.println(""); 
            
            }
        }
        // When the modded number is anything but 0, we have an odd number and run this
        // loop which prints the numbers in decending order
         else{
             for(int counter3 = x; counter3 > 0; counter3--) {
                 for(int counter4 =0 ;counter4 < counter3; counter4++ ) {
                 System.out.print("" + x);
             }
            System.out.println("");
         }   
        }
        }
       // The if and else statements ensure that the numbers are printed in the correct
       // order that they should be (ascending vs descending) to create the appearance of
       // a wave that we desire.
    
    
    // We have the same loops in our while and do-while loops, the only difference is that
    // we have to move the conditions in our for loop to their respective locations in
    // the other types of loops.
       
     System.out.println("WHILE LOOP:");
     int y = 1;
     while(y<=a){
         int b = y%2;
         if(b==0){
            
            for(int counter = 1; counter <= y; counter++) {
                for( int counter2 =0; counter2 < counter; counter2++) {
                 System.out.print("" + y); 
                    
                }
                
               System.out.println(""); 
            
            }
        }
         else{
             for(int counter3 = y; counter3 > 0; counter3--) {
                 for(int counter4 =0 ;counter4 < counter3; counter4++ ) {
                 System.out.print("" + y);
             }
            System.out.println("");
         }   
        }
    y++;    
    }
    int z = 1;    
    System.out.println("DO-WHILE LOOP:");
    do{
        int b = z%2;
        if(b==0){
            
            for(int counter = 1; counter <= z; counter++) {
                for( int counter2 =0; counter2 < counter; counter2++) {
                 System.out.print("" + z); 
                    
                }
                
               System.out.println(""); 
            
            }
        }
         else{
             for(int counter3 = z; counter3 > 0; counter3--) {
                 for(int counter4 =0 ;counter4 < counter3; counter4++ ) {
                 System.out.print("" + z);
             }
            System.out.println("");
         }   
        }
    z++;
    } while(z <= a);
    }
}