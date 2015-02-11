// Tom Schneible
// CSE 002 Spring2015
// HW 03


import java.util.Scanner;

    public class Bicycle {
    
        public static void main(String[] args) { ;
        
            Scanner myScanner;
            myScanner = new Scanner(System.in) ;
            
            System.out.println( "Enter the number of counts on the cyclometer.");
            
            double counts = myScanner.nextDouble();
            
            System.out.println( "Enter the number of seconds that these counts took.");
            
            double seconds = myScanner.nextDouble();
            
            // This is a constant that gives us the diameter of the bike wheels.   
                double wheelDiameter=27.0,
         
            // This is the constant pi.
                PI=3.14159;
         
            // This defines the distance as a variable
                double distance;
                
            // This helps to convert counts into miles
                double miles;
                
            // This defines minutes as a variable
                double minutes;
                
            // This helps to convert seconds to hours.
                double hours;
            
            // This defines the speed as a variable
                double mph;
            
            // This gives the distance in inches    
                distance = counts*wheelDiameter*PI;
            
            // We divide the seconds by 60. (60 sec/min)
                minutes = seconds/60;        
    
            // We divide the minutes by 60. (60 min/hr)
                hours = minutes/60;
                
            // We convert counts into feet (1 count= 1 inch,12 inch 1 ft.)
            // and then feet into miles. (5280 ft)
                miles = distance/(12*5280);
                
                mph = miles/hours;
                
            // Rounding decimal
            
                System.out.println("The distance was " +(int)( miles*100)/100.0 + " miles and took " + minutes + " minutes.");
                System.out.println("The average mph was " +(int)( mph*100)/100.0 + " mph.");
                
        }
    }
                