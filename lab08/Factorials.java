// Tom Schneible
// CSE2 Spring2015
// Factorials

import java.util.Scanner;

public class Factorials {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        int a = 0;
        
        for(int counter =1; counter <= num; counter++ ) {
            
            a += factorial(counter);
        }
    print(a);    
        
    }
    public static int factorial(int b) {
        int c = 1;
        for(int counter =1; counter<= b; counter++ ) {
            
            b*= counter;
        }
    System.out.println(b);
    return b;   
    }    
    
    public static void print(int num) {
        
        System.out.println("The super factorial is equal to: " + num);
    }
}