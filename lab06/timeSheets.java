//Yinchen Dong
//lab06
//Oct 2, 2015
//Time sheets Java Program
//CSE02-310
//This program is to ask the user to enter the number of employees timesheets
//employee's pay rate and their working hours for each day. Finally, calculate
//the total payroll of all employees for the week.
//
//  first compile the program
//      javac timeSheets.java
//  run the program
//      java timeSheets
//  import the Scanner class
import java.util.Scanner;

//  define a class
public class timeSheets {
//  add main method
  public static void main (String [] args) {
      Scanner myScanner = new Scanner ( System.in );  //declare an instance of the Scanner object
//and construct the instance of the Scanner
      System.out.print("Enter the number of employees timesheets: ");  //ask the user
//for the number of employee timesheets
      int numTimesheets = myScanner.nextInt();  //accept the user input
      int totalPayroll = 0; //initialize the counter for total payroll
      int count = 1;  //initialize the counter
      int payPerWeek;  //create a variable for pay of each employee per week
//use while statement to create a loop to calculate the payroll of employees
      while (count <= numTimesheets) {
            System.out.print("Enter the pay per hour in cents: ");  //ask the user for the pay per hour in cents
            int payPerHour = myScanner.nextInt();  //accept the user input
            System.out.print("Enter the working hours on Monday: ");  //ask the user for the working hours on MOnday
            int hoursMon = myScanner.nextInt();  //accept the user input
            System.out.print("Enter the working hours on Tuesday: ");  //ask the user for the working hours on Tuesday
            int hoursTues = myScanner.nextInt();  //accept the user input
            System.out.print("Enter the working hours on Wednesday: ");  //ask the user for the working hours on Wednesday
            int hoursWednes = myScanner.nextInt();  //accept the user input
            System.out.print("Enter the working hours on Thursday: ");  //ask the user for the working hours on Thursday
            int hoursThurs = myScanner.nextInt();  //accept the user input
            System.out.print("Enter the working hours on Friday: ");  //ask the user for the working hours on Friday
            int hoursFri = myScanner.nextInt();  //accept the user input
            payPerWeek = payPerHour * (hoursMon + hoursTues + hoursWednes + hoursThurs + hoursFri );  //calculate the pay of each employee per week
            totalPayroll = totalPayroll + payPerWeek;  //store the total payroll of all employees
            count++; //adds one count each run
      }
//  print out the output
      System.out.println("The total payroll of all employees is " + totalPayroll + "cents");
  }  //  end of main method
}  //end of class
            