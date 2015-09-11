//Yinchen Dong
//lab03
//Check Java Program
//September 11. 2015
//CSE02-310
//The Ckeck program is to use the Scanner class to obtain from the user
//the original cost of the check,
//the percentage tip they wish to pay,
//and the number of ways the check will be split 
//in order to calculate how much each person needs to pay the check.
//
//  first compile the program
//      javac Check.java
//  run the program
//      java Check

//  import the Scanner calss
import java.util.Scanner;

//  define a class
public class Check {
    
//  add main method
  public static void main (String [] args) {
      Scanner myScanner = new Scanner ( System.in );  //declare an instance of the Scanner object 
//and construct the instance of the Scanner
      System.out.print("Enter the original cost of the check in the form xx.xx: ");  //prompt the user for 
//the original cost of the check
      double checkCost = myScanner.nextDouble();  //accept the user input
      System.out.print("Enter the percentage tip that you wish to pay as a whole number(in the form xx): ");  //prompt the user
//for the tip percentage that they wish to pay
      double tipPercent = myScanner.nextDouble();  //accept the input
      tipPercent /= 100;  //we want to convert the percentage into a decimal value
      System.out.print("Enter the number of people who went out to dinner: ");  //prompt the user for the number of people 
//that went to dinner 
      int numPeople = myScanner.nextInt();  //accept the input
      
//  print out the output
      double totalCost;  //create variable for the total cost of the check
      double costPerPerson;  //create variable for the cost that each person needs to pay
      int dollars,  //whole dollar amount of cost
            dimes, pennies;  //for storing digits to the right of the decimal point for the cost$
      totalCost = checkCost * (1 + tipPercent);  //calculate the total cost of the check
      costPerPerson = totalCost / numPeople;  //calculate how much each person needs to pay
      dollars = (int) costPerPerson;  //get the whole amount, dropping decimal fraction
      dimes = (int) (costPerPerson * 10) % 10;  //get dimes amount, where the % operator returns the remainder
      pennies = (int) (costPerPerson * 100) % 10;  //get pennies amount, where the % operator returns the remainder
      System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);  //print
//the amount of money that each person needs to spend in order to pay the check
      
  }  //end of main method
}  //end of class