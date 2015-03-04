// Tom Schenible
// CSE2 Spring 2015
// Homework 6 Make Symbols

public class MakeSymbols {
    
    public static void main(String[] args){

// This generates a random number between 0 and 100 using Java's Math Function.
        int x = (int)(Math.random()*100);
        
// This duplicates the randomly generated number because we will need to print
// it out later, however we will be changing x in our loop. We will need it twice,
// so it is duplicated twice.
        int y = x;
        int z = x;
        
// We define this variable to help decide if a number is even or odd. All numbers that are even
// will be 0 when modulated by 2.
        int A = x%2;

// Runs the loop for the even numbers. We see that it is important to use .print instead
// of .println because we want to keep all of the symbols on the same line.
    if(A==0) {
        
// This must be kept out of the loop or it will print the line each time the loop runs.        
        System.out.println("Random Number Generated: " + y);
        do{
                System.out.print("*");
               x--; 
        } while(x>0); System.out.println("");
    }
    
// Runs the loops for the odd numbers in the same method described for the even numbers.    
    else {
        System.out.println("Random Number Generated: " + y);
        do{
                System.out.print("&");
                z--;
        } while(z>0); System.out.println("");
    }
}
}