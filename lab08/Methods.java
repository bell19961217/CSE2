//Yinchen Dong
//lab 08
//Methods Java Program
//16 October 2015
//CSE02-310
//This program is to ask the user for ten numbers and calculate the mean, the median
//and print out the results by using three different methods.
//
//  first compile the program
//      javac Methods.java
//  run the program
//      java Methods
//
//  import the Scanner class
import java.util.Scanner;

//  define a class
public class Methods {
//add the main method
    public static void main (String [ ] args) {
        Scanner myScanner = new Scanner(System.in);  //declare an instance of the Scanner object
//and construct the instance of the Scanner
        System.out.print("Enter the first number a: ");  //ask the user for the first number 
        int a = myScanner.nextInt();  //accept the user input
        System.out.print("Enter the first number b: ");  //ask the user for the second number 
        int b = myScanner.nextInt();  //accept the user input
        System.out.print("Enter the first number c: ");  //ask the user for the third number 
        int c = myScanner.nextInt();  //accept the user input
        System.out.print("Enter the first number d: ");  //ask the user for the fourth number 
        int d = myScanner.nextInt();  //accept the user input
        System.out.print("Enter the first number e: ");  //ask the user for the fifth number
        int e = myScanner.nextInt();  //accept the user input
        System.out.print("Enter the first number f: ");  //ask the user for the sixth number 
        int f = myScanner.nextInt();  //accept the user input
        System.out.print("Enter the first number g: ");  //ask the user for the seventh number 
        int g = myScanner.nextInt();  //accept the user input
        System.out.print("Enter the first number h: ");  //ask the user for the eighth number 
        int h = myScanner.nextInt();  //accept the user input
        System.out.print("Enter the first number i: ");  //ask the user for the nineth number 
        int i = myScanner.nextInt();  //accept the user input
        System.out.print("Enter the first number j: ");  //ask the user for the tenth number 
        int j = myScanner.nextInt();  //accept the user input
        double mean = mean( a,  b,  c,  d,  e,  f,  g,  h, i,  j);
        double median = median( e,  f);
        results(mean,median);
    }
//add the mean method to calculate the mean value 
    public static double mean(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
        int sum =  a +  b +  c +  d +  e +  f +  g +  h +  i +  j;  //calculate the sum of the set of number
        double mean = (double) sum /2;  //calculate the mean value
        return mean;
 }       
//add the median method to calculate the median value
    public static double median(int e, int f) {
    int sum = e + f; //calculate the sum of the middle two numbers
    double median = (double) sum/2;  //calculate the median of the set of the numbers
    return median;
    }
//add the void print method to print
    public static void results(double mean, double median) {
        System.out.println("The mean of these ten numbers is: " +  mean);
        System.out.println("The median of these ten numbers is: " +  median);
}
}
    