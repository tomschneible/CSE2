// Tom Schneible
// CSE 002 Spring2015
// Lab 2 Cyclometer

// This program will print the time each trip takes, the number of counts for each trip,
// the distance of each trip, and the total distance traveled.

//  defining class    
    public class Cyclometer{
    
    // main method
       public static void main(String[] args) {
       
      // This is the time the first trip took.
         int secsTrip1=480;  //
            
      // This is the time the second trip took
         int secsTrip2=3220;  //
            
      // This is the number of counts for trip 1.      
         int countsTrip1=1561;  //
         
      // This is the number of counts for trip 2.   
         int countsTrip2=9037; //
         
      // This is a constant that gives us the diameter of the bike wheels.   
         double wheelDiameter=27.0,
         
      // This is the constant pi.
         PI=3.14159, //
         
      // This relates feet and miles.    
         feetPerMile=5280,  //
         
      // This relates inches and feet.   
         inchesPerFoot=12,   //
         
      // This relates seconds and minutes  
         secondsPerMinute=60;  //
         
      // This delcares the variables below.   
         double distanceTrip1, distanceTrip2,totalDistance;
      
      // This prints the time trip 1 took and its number of counts   
         System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");
            
      // This prints the time trip 2 took and its number of counts.
         System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");
         
      // This computes the of distance trip 1 given the number of counts,
      // the diameter of the bike, and the constant pi that helps relate the two.
         distanceTrip1=countsTrip1*wheelDiameter*PI;
         
      // This converts the distance of trip 1 from inches into miles.   
         distanceTrip1/=inchesPerFoot*feetPerMile;
         
      // This combines the last two steps into one step, computing the distance fo trip 2,
      // and the convert it from inches into miles.
         distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
         totalDistance=distanceTrip1+distanceTrip2;
         
      // This prints the distance of trip 1.   
         System.out.println("Trip 1 was "+distanceTrip1+" miles");
         
      // This prints the distance of trip 2
         System.out.println("Trip 2 was "+distanceTrip2+" miles");
         
      // This prints the total distance of bothy trips   
         System.out.println("The total distance was "+totalDistance+" miles");
         
    }     

        
}       
    
    