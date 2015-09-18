//Yinchen Dong
//lab04
//Calculator Java Program
//September 18, 2015
//CSE02-310
//The Calculator program is to display and compute 
//a+b,a-b,a*b, or a/b according to the operator and print "illegal operator"
//if the operator is invalid by using the switch statement.
//
//  first compile the program
//      javac Calculator.java
//  run the program
//      java Calculator

//  import the Scanner class
import java.util.Scanner;

//  define a class
public class Calculator {
//  add main method
  public static void main (String [] args) {
      Scanner myScanner = new Scanner ( System.in );  //declare an instance of the Scanner object
//and construct the instance of the Scanner
      System.out.print("Enter the integer a: ");  //prompt the user for the integer a
      int a = myScanner.nextInt();  //accept the user input
      System.out.print("Enter the integer b: ");  //prompt the user for the integer b
      int b = myScanner.nextInt();  //accept the user input
      System.out.print("Enter the operator: ");  //prompt the user for the operator
      String operator = myScanner.next();  //prompt the user for the operator
//  print out the oupout 
      int sum;  //create variable for the sum of a and b
      int difference;  //create variable for the difference of a and b
      int multiplication;  //create variable for the multiplication of a and b
      double division;  //create varible for the result of a / b
// 
      switch(operator){
            case "+":    
                  System.out.println(a + b);  //calculate the result of a + b
                  break;
            case "-": difference = a - b; 
                  System.out.println(a - b);  //calculate the result of a - b
                  break;
            case "*": 
                  System.out.println(a * b);  //calculate the result of a * b
                  break;
            case "/": 
                  System.out.println((double)a/(double)b);  //calculate the result of a / b
                  break;
            default: 
                  System.out.println("Illegal operator");  //display "illegal operator" for all the invalid operators
                  break;
           
      }
      
  }  //end of main method
}  //end of class