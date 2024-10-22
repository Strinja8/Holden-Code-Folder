/*
Miles Per Hour Calculator
Holden Strinja
October 16, 2024
The Program takes in a distance in miles, and a time in hours and minutes then converts those values to a speed in MPH to determine the rate you must trael to reach the distance in
the given time
 */

import java.util.Scanner;

public class MilesPerHour {
double D, MPH, H, M, TH = 0.0;
Scanner nums = new Scanner(System.in);

//Method to get info from the user
public void setinfo() {
System.out.print("Enter the Distance: ");
D = nums.nextDouble();
System.out.print("Enter the Hours: ");
H = nums.nextDouble();
System.out.print("Enter the Minutes: ");
M = nums.nextDouble();
}

//converting minutes to hours, and adding them to a Total Hours variable. then Calcualting our MPH
public void calc() {
TH = H + (M/60);
MPH = D/TH;
}

//Printing out our MPH and other info
public void print(){
    System.out.println( D + " Miles in " + H + " hours and " + M + " minutes = " + MPH + " Miles Per Hour!");
}




}
