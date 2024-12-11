/*
Array Fun House
Holden Strinja
December 11, 2024
The program takes two arrays, prints out the values of the array, takes the sum of values from a certain start and end position in the array, and tallies the amount of a certain
number in each array and prints the total.
 */

import java.util.Arrays;

public class arrayFHRunner {
    
    //Initializing Arrays and Variables
    int[] one = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
    int[] two = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};
    int sum, counter;

//Method to sum up each different Array and print the total
    public void getsum(int[] numArray, int start, int stop) {
    for (int i = start; i <= stop; i++) {
        sum += numArray[i];
    }
    System.out.println("The Sum of Numbers " + start + "-" + stop + " is: " + sum);
    sum = 0;
}  

//Method to count the number of occursions of a certain number and printing the totals
public void count(int[] numArray, int value) {
    for (int i = 0; i <= numArray.length-1; i++) {
        if (numArray[i] == value) {
            counter++;
        }
    }
    System.out.println("# of " + value + "s = " + counter);
    counter = 0;
}
}



