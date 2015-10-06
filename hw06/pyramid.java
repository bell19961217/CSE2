//Yinchen Dong
//hw06
//pyramid Java Program
//6 October 2015
//CSE02-310
//The pyramid program is to ask the user what size pyramid they want to display
//and then print a scalable pyramid by using nested loops
//
//  first compile the program
//      javac pyramid.java
//  run the program
//      java pyramid
//
//  import the Scanner class
import java.util.Scanner;

//  define a class
public class pyramid {
//  add main method
  public static void main (String [] args) {
      Scanner myScanner = new Scanner ( System.in );  //declare an instance of the Scanner object
//and construct the instance of the Scanner
      System.out.print("Enter the size of the pyramid: ");  //ask the user for the size of the pyramid
      int size = myScanner.nextInt();  //accept the user input
//Use nested for loops to display and print the scalable pyramid
      for (int countRow = 1; countRow <= size; countRow++) { //initialize the counter and set up the condition
          for(int countSpace = 1; countSpace <= (size-countRow) ; countSpace++){  //create space for the format
          System.out.print(" ");  //print the space
          }
          for(int countStar = 0; countStar < (2 * countRow - 1) ; countStar++){   //initialize 
//the coounter and set up the condition to test
          System.out.print("*");  //print the pyramid by using asterisks
          }
      System.out.println();  //display the pyramid
      }  
  }  //end of main method
}  //end of class
             
             

     
      
      