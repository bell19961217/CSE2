//Yinchen Dong
//hw03
//Timer Java Program
//September 15, 2015
//CSE02-310
//The Timer program is to use the Scanner class to prompt the user
//for the current time and dinner time and calculate the remaining time until dinner.
//
//  first compile the program
//      javac Timer.java
//  run the program
//      java Timer

//  import the Scanner class
import java.util.Scanner;

//  define a class
public class Timer {
    
//  add main method
  public static void main (String [] args) {
      Scanner myScanner = new Scanner ( System.in );  //declare an instance of the Scanner object
//and construct the instance of the Scanner
      System.out.print("Enter the current time: ");  //prompt the user
//for the current time
      int currentTime = myScanner.nextInt();  //accept the user input
      System.out.print("Enter the time that you will be eating dinner: ");  //prompt
//the user for the dinner time
      int dinnerTime = myScanner.nextInt();  //accept the user input
      
//  print out the output
      int remainingTime;  //create variable for the remaining time
      int hours;  //whole hour amount of remaining time
      int minutes;  //for storing the amount of minutes in the remaining time
      remainingTime = dinnerTime - currentTime;  //calculate the remaining time
      hours = remainingTime / 100;  //get the amount of hours of the remaining time
      if ( remainingTime % 100 < 60 ) {  //get the amoung of minutes of the remaining time
//% operator returns the remainder
          minutes = remainingTime % 100;
      }else  {
          minutes = remainingTime % 100 - 40;
//use if statements to make sure getting the right amount of minutes from the remaining time; 40 is from (100-60) for that there
//are only 60 minutes in one hours
      } 
//print out the remaining time in hours and minutes   
      System.out.println("You have " + hours + " hours and " + minutes + " minutes until dinner.");
  }  //end of main method
}  //end of class