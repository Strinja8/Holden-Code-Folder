/* 
Leap Year Calculator
Holden Strinja
October 24, 2024
The Program takes in a year from the user, then calculates whether the year is or is not a leap year
 */

import java.util.Scanner;
public class LeapYearRunner {
    
    int y;
    Scanner year = new Scanner(System.in);

    // Method to get the year from the user
    public void setYear(){
        System.out.print("Enter a Year: ");
        y = year.nextInt();
    }

    // the conditional calculations deciding if a year is or isnt a leap year
    public void calc() {
        if ((y % 4) == 0 && (y % 100) != 0){
            System.out.println(y + " is a leap year!");
        }
        else if ((y % 400) == 0) {
            System.out.println(y + " is a leap year!");
        }
        else {
            System.out.println(y + " is NOT a leap year.");
        }
    }

}
