//Yinchen Dong
//hw05
//Average Grade Java Program
//October 1, 2015
//CSE02-310
//This program is to keep asking a grade to be entered until a invalid grade
//that is smaller than 0 or greater than 100. The program should exit the repetition loop 
//and calculate the average grade after an invalid grade is entered.
//
//  first compile the program
//      javac averageGrade.java
//  run the program
//      java averageGrade
//  import the Scanner class
import java.util.Scanner;

//  define a class
public class averageGrade {
//  add main method
  public static void main (String [] args) {
      Scanner myScanner = new Scanner ( System.in );  //declare an instance of the Scanner object
//and construct the instance of the Scanner
      System.out.print("Enter the grade: ");  //ask user for the grade
      int grade = myScanner.nextInt();  //accept the user input
      double averageGrade;  //create varialbe for the average grade
      int totalGrade = 0;  //initialize the counter for the total grade to store all the grades entered
      int count = 0;  //initialize the counter to count the number of grades
//use while statement to keep asking the user for the grades
      while ( grade >= 0 && grade <= 100 ) {
          totalGrade = totalGrade + grade;
          System.out.print("Enter the grade: ");  //ask user for the grade
          grade = myScanner.nextInt();  //accept the user input
          count++;  //add 1 when running each time
          if ( grade < 0 || grade > 100 ) {
              System.out.println("Invalid grade");  //print the message for invalid grade
              break;  //exit the loop when a invalid grade is entered
          }
      }
// calculate the average grade
     averageGrade = (double) totalGrade / (double) count;
     System.out.println("The average of valid grades is: " + averageGrade);  //print the average number of all valid grades
  }  //end of main method
}  //end of class
  