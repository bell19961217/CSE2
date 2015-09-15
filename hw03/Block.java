//Yinchen Dong
//hw03
//Block Java Program
//September 15, 2015
//CSE02-310
//The Block program is to prompot the user for the length, width, and height
//of a block and calculate the volume of the block and the surface area.
//
//  first compile the program
//      javac Block.java
//  run the program
//      java Block

//  import the Scanner class
import java.util.Scanner;

//  define a class
public class Block {
    
//  add main method
  public static void main (String [] args) {
      Scanner myScanner = new Scanner ( System.in );  //declare an instance of the Scanner object
//and construct the instance of the Scanner
      System.out.print ("Enter the length of the block: ");  //prompt the user for the length of the block
      double length = myScanner.nextDouble();  //accept the user input
      System.out.print ("Enter the width of the block: ");  //prompt the user for the width of the block
      double width = myScanner.nextDouble();  //accept the user input
      System.out.print ("Enter the height of the block: ");  //prompt the user for the height of the block
      double height = myScanner.nextDouble();  //accept the user input
      
//  print out the output
      double volume;  //create variable for the volume of the block
      double surfaceArea;  //create variable for the surface area of the block
      volume = length * width * height;  //calculate the volume of the block
      surfaceArea = 2 * (length * width + length * height + width * height);  //calculate
//the surface area of the block
      System.out.println("The volume of the block of dimensions " + length + " x " + width + " x " + height + " is " + volume + ".");
//print out of the volume of the block
      System.out.println("The surface area of the block is " + surfaceArea + ".");
//print out the surface area of the block
      
  }  //end of main method
}  //end of class