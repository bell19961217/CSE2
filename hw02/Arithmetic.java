// Yinchen Dong
//hw02
//Arithmetic Java Program
//September 7, 2015
//CSE02-310
//The Arithmetic program is to calculate the total cost of each kind of item,
//sales tax for that total cost,
//total coat of purchases before tax,
//the total sales tax,
//and the total cost of purchases including sales tax.
//
//  first compile the program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic

//  define a class
public class Arithmetic {
    
//  add main method
  public static void main (String [] args) {
//  input variables
  int pairsSocks = 3; //number of pairs of socks
  double sockCost$ = 2.58; //cost per pair of socks
  int numGlasses = 6; //number of drinking glasses
  double glassCost$ = 2.29; //cost per glass
  int boxesEnvelopes = 1; //number of boxes of envelopes
  double envelopeCost$ = 3.25; //cost per box of envelopes
  double taxPercent = 0.06; //sales tax is 6%
  double totalSockCost$, totalGlassCost$, totalEnvelopeCost$; //create variables for the total cost of each kind of item
  double sockTax$, glassTax$, envelopeTax$; //create variables for the sales tax for the total cost of each kind of item
  double totalPurchases$, totalTax$, actualTransaction$; //create variables for total cost before tax,
//total tax and actual transaction including total tax

//  run the calculations; store the values.
  totalSockCost$ = pairsSocks * sockCost$;  //total cost of socks
  totalGlassCost$ = numGlasses * glassCost$;  //total cost of drinking glasses
  totalEnvelopeCost$ = boxesEnvelopes * envelopeCost$;  //total cost of envelopes
//Above gives the total cost of each kind of items
  sockTax$ = totalSockCost$ * taxPercent; //sales tax for the total cost of socks
  glassTax$ = totalGlassCost$ * taxPercent;  //sales tax for the total cost of glasses
  envelopeTax$ = totalEnvelopeCost$ * taxPercent;  //sales tax for the total cost of envelopes
//Above gives the sales tax for the total cost of each kind of item
  totalPurchases$ = totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$;  //total cost of purchases before tax
  totalTax$ = sockTax$ + glassTax$ + envelopeTax$;  //total sales tax of the purchases
  actualTransaction$ = totalPurchases$ + totalTax$;  //total transaction of the purchase including sales tax
  
//  print out the output data
  System.out.println("The total cost of socks is " + (int) (totalSockCost$ * 100 ) / 100.0  + " dollars.");
  System.out.println("The total cost of glasses is " + (int) (totalGlassCost$ * 100) / 100.0 + " dollars.");
  System.out.println("The total cost of envelopes is " + (int) (totalEnvelopeCost$ * 100) / 100.0 + " dollars.");
  System.out.println("The sales tax for socks is " + (int) (sockTax$ * 100) / 100.0 + " dollars.");
  System.out.println("The sales tax for glasses is " + (int) (glassTax$ * 100) / 100.0 + " dollars.");
  System.out.println("The sales tax for envelopes is " +(int) (envelopeTax$ * 100) / 100.0+ " dollars.");
  System.out.println("The total cost of purchases before tax is " + (int) (totalPurchases$ * 100) / 100.0 + " dollars.");
  System.out.println("The total sales tax is " + (int) (totalTax$ * 100) / 100.0 + " dollars.");
  System.out.println("The total cost of purchases including tax is " + (int) (actualTransaction$ * 100) / 100.0 + " dollars.");
  
  }  //end of main method
}  //end of class
        