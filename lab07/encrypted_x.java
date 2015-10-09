//Yinchen Dong
//lab07
//9 October 2015
//CSE02-310
//encrypted_x Java Program
//The program is to hide the secret message X in a handful of stars
//by using nested loops.
//
//  first compile the program
//      javac encrypted_x.java
//  run the program
//      java encrypted_x
//
//  import the Scanner class
import java.util.Scanner;

//  define a class
public class encrypted_x {
//  add main method
  public static void main (String [] args) {
      Scanner myScanner = new Scanner ( System.in );  //declare an instance of the Scanner object
//and construct the instance of the Scanner
      System.out.print("Enter the size of the square: ");  //ask the user for the size of the square
      int input = myScanner.nextInt();  //accept the user input
// use if-else statement to check if the input is valid
      if(input > 0 && input < 100) {
          for (int i = 0; i < input + 1; i++) { //initialize variable for the number of lines of the square and set the condition
            for (int j = 0; j < input + 1; j++) {  //initialize variable for the number of colums in the square
              if ( i == j ||j == input - i) {  //print the space
                  System.out.print(" ");
              } 
              else {
                  System.out.print("*");
              }
            }
            System.out.println("");  //display the encrypted x
          }
          
      }
     
  }  //end of the main method
}  //end of class
                  
            
        
      
