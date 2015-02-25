// Tom Schneible
// CSE2 Spring2015
// Homework 5

// Imports Scanner Utility
import java.util.Scanner;

public class ToHex {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
// Asks user for initial values        
        System.out.println("Please enter three numbers representing RGB values.");
        
// Defines and assigns intergers blank values temporarily       
        int A = 0;
        int B = 0;
        int C = 0;

// Defines a set of strings that will be used to print final statement        
        String Hex1;
        String Hex2;
        String Hex3;
        String HexA;
        String HexB;
        String HexC;

// Lines 31-68 check if the input contains only intergars and then validate if the
// numbers are valide RGB numbers. This is done 3 times for each number.
        if(!scanner.hasNextInt()){
            System.out.println("Your input must consist of integers.");
            System.exit(0);
        }
        
        else {String Z = scanner.next();
            A = Integer.parseInt(Z);
            if(A>255){
                System.out.println("You did not enter valid RGB values.");
                System.exit(0);
        }
        }
        
        if(!scanner.hasNextInt()){
            System.out.println("Your input must consist of integers.");
            System.exit(0);
        }
        
        else {String Y = scanner.next();
            B =Integer.parseInt(Y);
            if(B>255){
            System.out.println("Your input must consist of integers.");
            System.exit(0);
        }
        }
        
        if(!scanner.hasNextInt()){
            System.out.println("Your input must consist of integers.");
            System.exit(0);
        }
        
        else {String W = scanner.next();
            C =Integer.parseInt(W);
            if(C>255){
            System.out.println("Your input must consist of integers.");
            System.exit(0);
        }
        }

// Lines 72-74 obtain the first number required for hexadecimal conversion. 
// If this is 1-9 it can simply be printed.
        HexA = ""+A/16;
        HexB = ""+B/16;
        HexC = ""+C/16;
        
// Lines 77-79 find the remainder. If this is 1-9, it can simply be printed.        
        Hex1 = ""+A%16;
        Hex2 = ""+B%16;
        Hex3 = ""+C%16;
        
// Lines 82-201 convert any remainders above 10 to the correct RGB notation (A-F)      
        switch(Hex1){
            case "10":
                Hex1 = "A";
            break;
            case "11":
                Hex1 = "B";
            break;
            case "12":
                Hex1 = "C";
            break;
            case "13":
                Hex1 = "D";
            break;
            case "14":
                Hex1 = "E";
            break;
            case "15":
                Hex1 = "F";
            break;
        }
        switch(Hex2){
            case "10":
                Hex2 = "A";
            break;
            case "11":
                Hex2 = "B";
            break;
            case "12":
                Hex2 = "C";
            break;
            case "13":
                Hex2 = "D";
            break;
            case "14":
                Hex2 = "E";
            break;
            case "15":
                Hex2 = "F";
            break;
        }
        switch(Hex3){
            case "10":
                Hex3 = "A";
            break;
            case "11":
                Hex3 = "B";
            break;
            case "12":
                Hex3 = "C";
            break;
            case "13":
                Hex3 = "D";
            break;
            case "14":
                Hex3 = "E";
            break;
            case "15":
                Hex3 = "F";
            break;
        }
        switch(HexA){
            case "10":
                HexA = "A";
            break;
            case "11":
                HexA = "B";
            break;
            case "12":
                HexA = "C";
            break;
            case "13":
                HexA = "D";
            break;
            case "14":
                HexA = "E";
            break;
            case "15":
                HexA = "F";
            break;
        }
        switch(HexB){
            case "10":
                HexB = "A";
            break;
            case "11":
                HexB = "B";
            break;
            case "12":
                HexB = "C";
            break;
            case "13":
                HexB = "D";
            break;
            case "14":
                HexB = "E";
            break;
            case "15":
                HexB = "F";
            break;
        }
        switch(HexC){
            case "10":
                HexC = "A";
            break;
            case "11":
                HexC = "B";
            break;
            case "12":
                HexC = "C";
            break;
            case "13":
                HexC = "D";
            break;
            case "14":
                HexC = "E";
            break;
            case "15":
                HexC = "F";
            break;
        }
 
// This line prints the intial numbers associated with their respective colors, and then
// prints the hexidecimal conversion.
        System.out.println("The decimal nunbers are R:" + A + " G:" + B + " B:" + C + ", are represented in hexidecimal as " + HexA + Hex1 + HexB + Hex2 + HexC + Hex3 );
    }
}
