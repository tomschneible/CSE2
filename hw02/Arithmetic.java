// Tom Schneible
// CSE 002 Spring2015
// HW2 Arithmetic

public class Arithmetic {
    
    public static void main(String[] args) {
        // These lines define the variables for the numbers and costs of each item
        // purchased: socks, glasses, and envelopes.
        int nSocks=3;
        double sockCost$=2.58;
        int nGlasses=6;
        double glassCost$=2.29;
        int nEnvelopes=1;
        double envelopeCost$=3.25;
        
        // This defines the varible for the tax applied to the purchase
        double taxPercent=0.06;
        
        // These lines define the total cost of each item and then
        // calculates the total cost of each item purchased by multiplying
        // the quantity of the items by their respective costs.
        double totalSocksCost$=nSocks*sockCost$;
        double totalGlassesCost$=nGlasses*glassCost$;
        double totalEnvelopesCost$=nEnvelopes*envelopeCost$;
        
        // This defines the total cost of all the objects purchases prior to
        // tax, and then calculates this number by adding the total cost of each
        // item together
        double totalCostBeforeTax$=totalSocksCost$+totalGlassesCost$+totalEnvelopesCost$;
        
        // This defines the total cost of all the objects in addition to tax, and then
        // calculates this number by first multiplying the cost before tax by the tax percentage,
        // and then adding this number to the price before tax.
        double totalCostAfterTax$=totalCostBeforeTax$*taxPercent+totalCostBeforeTax$;
        
        
        // These lines print the cost of each item, and the total costs of the items before tax
        System.out.println("The socks cost $" +totalSocksCost$);
        System.out.println("The glasses cost $" +totalGlassesCost$);
        System.out.println("The envelopes cost $" +totalEnvelopesCost$);
        System.out.println("The total cost before tax was $"+ totalCostBeforeTax$);
        
        // This prints total cost of all the items with tax, and converts it to a number
        // with only two decimals
        System.out.println("The total cost after tax was $"+(int)( totalCostAfterTax$*100)/100.0);
   
    }   

    
}