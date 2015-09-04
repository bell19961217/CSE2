//Yinchen Dong
//lab 02
//September 3, 2015
//CSE02-310
//Cyclometer Java Program
//The bicycle cyclometer is to measure the time of each trip
//measure the number of counts for each trip
//measure the distance of each trip in miles
//measure the distance for the two trips
//
//  first compile the program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//

//  define a class
public class Cyclometer {
    
//  add main method
  public static void main(String[ ] args) {
//  our input data
  int secsTrip1 = 480;  //the number of seconds for trip1
  int secsTrip2 = 3220;  //the number of seconds for trip2
  int countsTrip1 = 1561;  //the number of counts for trip1
  int countsTrip2 = 9037;  //the number of counts for trip2
  double wheelDiameter = 27.0,  //the diameter of the front wheel
  PI = 3.14159,  //the number of pi
  feetPerMile = 5280,  //the number of feet in one miel
  inchesPerFoot = 12,  //the number of inches in one foot
  secondsPerMinute = 60; //the number of seconds in one minute
  double distanceTrip1, distanceTrip2,totalDistance;  //create variables for distances 
//  print the statements
  System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " + countsTrip1 + " counts.");
  System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had " + countsTrip2 + " counts.");
//  run the calculations; store the values.
  distanceTrip1 = countsTrip1*wheelDiameter*PI;
  // Above gives distance in inches
  //(for each count, a rotation of the wheel travels
  //the diameter in inches times PI)
  distanceTrip1 /= inchesPerFoot*feetPerMile;  //Gives distance in miles
  distanceTrip2 = countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
  totalDistance = distanceTrip1 + distanceTrip2;
//  print out the output data.
  System.out.println("Trip 1 was " + distanceTrip1 + " miles ");
  System.out.println("Trip 2 was " + distanceTrip2 + " miles ");
  System.out.println("The total distance was "+totalDistance+"miles ");
 
  }  //end of main method
}  //end of class


