// Tom Schneible
// CSE2 Spring2015
// HW 04 What Number?

import java.util.Scanner;

public class WhichNumber {
    
    public static void main(String[] args) { ;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Think of a number between one and ten and I will try to guess it.");
        
        System.out.println("Is the number even?");
        
        String A = myScanner.next();
        
        if (A.equals("Yes")) { 
            
            System.out.println("Is the number divisible by 3?");
            
            String B = myScanner.next();
            
            if (B.equals("Yes")) { 
                
                System.out.println("Is your number 6?");
                
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
    
    