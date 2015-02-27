// Tom Schneible
// CSE2
// Lab 5 Space Exploration

public class SpaceExploration {
    
    public static void main(String[] args) {

// This line generates a random number between 2000 and 2011        
        int year = (int)(Math.random()*11 + 2000);
        
// Defines the base variable year1 for use in the switch statement
        int year1 = 2000;
// Prints the opening statement giving the range of years that will be printed.        
        System.out.println("Here is a timeline of space exploration events from " + 2000 + " to " + (year -1) + ":");

// Defines all of the string that will be printed. This makes the switch statement less cluttered. 
        String A = "First spacecraft orbits an asteroid.";
        String B = "First spacecraft lands on an asteroid.";
        String C = "Largest infrared telescope released.";
        String D = "Spacecraft collides with comet.";
        String E = "Spacecraft returns with collections from a comet.";
        String F = "Kepler launched to study deep space.";
        String G = "SpaceX sucessfully sends spacecraft to orbit and back.";
        String H = "N/A";

// Begins the switch statement, which prints different output depending on which
// year we want to end at.
        switch(year1){
            
            case(2000):
                System.out.println("2000: " +A);
// Adds one to the year. If this new year is equal to the end year we
// randomly generated, we have a break statement that ends the switching.
// If the new year is not equal to the year we randomly generated, 
// then we do not break and move on and print the next case.

// This process continues for each case until we reach the end.
                year1 = year1 +1;
                if(year1 == year) {
                    break;
                }
                
            case(2001):
                System.out.println("2001: " +B);
                year1 = year1 +1;
                if(year1 == year) {
                    break;
                }
          
            case(2002):
                System.out.println("2002: " +H);
                year1 = year1 +1;
                if(year1 == year) {
                    break;
                }
            
            case(2003):
                System.out.println("2003: " +C);
                year1 = year1 +1;
                if(year1 == year) {
                    break;
                }
            
            case(2004):
                System.out.println("2004: " +H);
                year1 = year1 +1;
                if(year1 == year) {
                    break;
                }
               
            case(2005):
                System.out.println("2005: " +D);
                year1 = year1 +1;
                if(year1 == year) {
                    break;
                }
               
            case(2006):
                System.out.println("2006: " +E);
                year1 = year1 +1;
                if(year1 == year) {
                    break;
                }
            
            case(2007):
                System.out.println("2007: " +H);
                year1 = year1 +1;
                if(year1 == year) {
                    break;
                }
            
            case(2008):
                System.out.println("2008: " +F);
                year1 = year1 +1;
                if(year1 == year) {
                    break;
                }
              
            case(2009):
                System.out.println("2009: " +H);
                year1 = year1 +1;
                if(year1 == year) {
                    break;
                }

            case(2010):
                System.out.println("2010: " +G);
                year1 = year1 +1;
                if(year1 == year) {
                    break;
                }
               
            case(2011):
                System.out.println("2011:" +H);
                year1 = year1 +1;
                if(year1 == year) {
                    break;
                }
                
        }
        
    }
}