/*
Loop Stats
Holden Strinja
November 1, 2024
The program gets a minimun and a maximum parameter and then adds
each number between those numbers together while also counting
and printing the total amount of even and odd numbers inbetween
your parameters
 */

import java.util.Scanner;

public class loopStatsRunner {

    //Defining variables and scanner
    Scanner nums = new Scanner(System.in);
    int max, min, even, odd, total;

    //Method to get our max and min parameters
    public void setnums() {
        System.out.print("Enter in a Minimum Parameter: ");
        min = nums.nextInt();
        System.out.print("Enter in a Maximum Parameter: ");
        max = nums.nextInt();
    }

    // Method to calculate the total sum of all numbers, all even numbers, and all odd numbers
    public void calc() {
        for(int i = min; i <= max; i++) {
            total += i;
            if (i % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
    }

    //Method to print out total numbers, all evens, and all odds
    public void print() {
        System.out.println("Total Numbers: " + total);
        System.out.println("Total Even Numbers: " + even);
        System.out.println("Total Odd Numbers: " + odd);
    }
}
