/*
Cool Numbers Calculator
Holden Strinja
November 1, 2024
the program gets a max value from the user, the program then checks every number between 6 and the max value. For everynumber in between 6 and the max that has a remander of 1 when
divided by 2, 3, 4, 5, and 6 it is considered a cool number and tallied up, it then prints the total amount of "cool numbers" in betweeb 6 and the max.
 */

import java.util.Scanner;

public class coolnumsRunner {

    //Defining variables and scanner
    Scanner nums = new Scanner(System.in);
    int max, count;
    boolean cooln;

    //method to get a max value from the user
    public void setnums() {
        System.out.print("\nEnter in your Maximum Number: ");
        max = nums.nextInt();  
        }   

        //Method to test if a number is cool
        public void iscn() {
        if (max % 3 == 1 && max % 4 == 1 && max % 5 == 1 && max % 6 == 1) {
            cooln = true;
        }
     }
 
    //Method to calculate total of "cool numbers"
        public void countcn() {
        for (int i = 6; i < max; i++) { //For loop to check every number between 6 and the max
            if (i % 3 == 1 && i % 4 == 1 && i % 5 == 1 && i % 6 == 1) {
                count++; // Adding to the total cool numbers counter
            }
        }
    }

   // Final Print Method
    public void print() {
        if (cooln) {
            System.out.println(max + " is a cool number!");
        }
        else {
            System.out.println(max + " is NOT a cool number.");
        }
        System.out.println("There are " + count + " cool numbers between 6 - " + max);
        count = 0; // Resetting the count variable if played multiple times in a row
    }
}
