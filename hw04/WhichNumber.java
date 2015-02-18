// Tom Schneible
// CSE2 Spring2015
// HW 04 What Number?

// Importing Scanner utility
import java.util.Scanner;

// Defining Public Class
public class WhichNumber {

// Defining Main Method    
    public static void main(String[] args) { ;

    // Declaring a new Scanner
        Scanner myScanner = new Scanner(System.in);
        
   // Asks the user for initial input   
        System.out.println("Think of a number between one and ten and I will try to guess it.");
        
        System.out.println("Is the number even?");
        
   // Strings A through I are used to figure out which number the user is thinking of.
   // They store yes or no answers from the user and based on these inputs will bring to user
   // to a different string depending on the input.
        String A = myScanner.next();
  
   // The program works by asking the user a series of yes or no questions using if and else if
   // statements. The else and else if statements direct the user to the numbers they are thinking
   // of by asking questions that help to narrow down which number it could be.
   // The else statements verify if the user is imputing yes or no as answers, and prevent
   // the user from inputing useless information.
        if (A.equals("Yes")) { 
            
            System.out.println("Is the number divisible by 3?");
            
            String B = myScanner.next();
            
            if (B.equals("Yes")) { 
                
                System.out.println("Is your number 6?");
                
           // Strings J through R verify that the input is either correct.     
                String J = myScanner.next();
                        
                    if(J.equals("Yes")) {
                        System.out.println("Yay!");
                        }
                    else if(J.equals("No")) {
                        System.out.println("That is not consistent.");
                        } 
                    
                    else {
                        System.out.println("That is not a valid input.");
                        }  
            }
            
            else if (B.equals("No")) { 
                System.out.println("Is the number divisible by 4?");
                
                String C = myScanner.next();
                
                if (C.equals("No")) { 
                    System.out.println("Is the number divisible by 5?");
                    
                    String D = myScanner.next();
                    
                    if (D.equals("Yes")) {
                        System.out.println("Is your number 10?");
                        
                        String K = myScanner.next();
                        
                    if(K.equals("Yes")) {
                        System.out.println("Yay!");
                        }
                    else if(K.equals("No")) {
                        System.out.println("That is not consistent.");
                        } 
                    
                    else {
                        System.out.println("That is not a valid input.");
                        }
                    }
                    else if (D.equals("No")) {
                        System.out.println("Is your number 2?");
                        
                        String L = myScanner.next();
                        
                    if(L.equals("Yes")) {
                        System.out.println("Yay!");
                        }
                    else if(L.equals("No")) {
                        System.out.println("That is not consistent.");
                        }
                        
                    else {
                        System.out.println("That is not a valid input.");
                        }
                    }
                }
                
                if (C.equals("Yes")) {
                    
                    System.out.println("When your number is divided by four, is it greater than one?");
                    
                    String E = myScanner.next();
                    
                    if (E.equals("Yes")) { 
                        System.out.println("Is your number 8?");
                        
                        String M = myScanner.next();
                        
                    if(M.equals("Yes")) {
                        System.out.println("Yay!");
                        }
                    else if(M.equals("No")) {
                        System.out.println("That is not consistent.");
                        } 
                    else {
                        System.out.println("That is not a valid input.");
                        }   
                    }
                    else if (E.equals("No")) { 
                        System.out.println("Is your number 4?");
                        
                        String N = myScanner.next();
                        
                        if(N.equals("Yes")) {
                            System.out.println("Yay!");
                        }
                        else if(N.equals("No")) {
                            System.out.println("That is not consistent.");
                        
                        }
                        else {
                        System.out.println("That is not a valid input.");
                        }
                    } 
                }
            }
        }
    
    
        else if(A.equals("No")) {
            System.out.println("Is the number divivisble by 3?");
            
            String F = myScanner.next();
            
            if(F.equals("Yes")) {
                System.out.println("When your number is divided by three, is it greater than one?");
                
                String G = myScanner.next();
                
                if(G.equals("Yes")) {
                    System.out.println("Is your number 9?");
                    
                     String O = myScanner.next();
                        
                    if(O.equals("Yes")) {
                        System.out.println("Yay!");
                        }
                    else if(O.equals("No")) {
                        System.out.println("That is not consistent.");
                        } 
                    else {
                        System.out.println("That is not a valid input.");
                        }
                
                }
                else if(G.equals("No")) {
                    System.out.println("Is your number 3?");
                    
                     String P = myScanner.next();
                        
                    if(P.equals("Yes")) {
                        System.out.println("Yay!");
                        }
                    else if(P.equals("No")) {
                        System.out.println("That is not consistent.");
                        } 
                    else {
                        System.out.println("That is not a valid input.");
                        }
                    
                }
            }
        
         if(F.equals("No")) {
             System.out.println("Is your number greater than 6?");
             
             String H = myScanner.next();
             
             if(H.equals("Yes")) {
                 System.out.println("Is your number 7?");
                 
                 String Q = myScanner.next();
                        
                    if(Q.equals("Yes")) {
                        System.out.println("Yay!");
                        }
                    else if(Q.equals("No")) {
                        System.out.println("That is not consistent.");
                        }
                        
                    else {
                        System.out.println("That is not a valid input.");
                        }
             }
             else if(H.equals("No")) {
                System.out.println("Is your number less than 3?");
                
                String I = myScanner.next();
                if(I.equals("Yes")) {
                    System.out.println("Is your number 1?");
                    
                    String R = myScanner.next();
                        
                    if(R.equals("Yes")) {
                        System.out.println("Yay!");
                        }
                    else if(R.equals("No")) {
                        System.out.println("That is not consistent.");
                        } 
                    else {
                        System.out.println("That is not a valid input.");
                        }
    
                }
                else if(I.equals("No")) {
                    System.out.println("Is your number 5?");
                    
                    String S = myScanner.next();
                        
                    if(S.equals("Yes")) {
                        System.out.println("Yay!");
                        }
                    else if(S.equals("No")) {
                        System.out.println("That is not consistent.");
                        } 
                
                    else {
                        System.out.println("That is not a valid input.");
                        }
                }    
            }   
        }
    
        
        else {
            System.out.println("That is not a valid input.");
        }
    }
}
}
// We see in this program that bracket matching is essential for if, if else, and else statements
// to properly run. If one bracket is out of place, it is possible for the entire code to be incorrect
// and either not run or output the wrong information. I found that this was the easiest way to debug the 
// program.
    