/*
Add and Subtract Calculator
Holden Strinja
October 25, 2024
The program asks for two numbers a and b, if a is greater than b, a-b is printed. if b is greater than a ,b-a is printed. and if a and b are equal, a+b is printed
 */

import java.util.Scanner;

public class AddSubRunner {


    Scanner nums = new Scanner(System.in);
    int a, b;

    // Method to get out a and b variables
    public void setnums() {
        System.out.print("Enter a Number: ");
        a = nums.nextInt();
        System.out.print("Enter a Number: ");
        b = nums.nextInt();
    }

    // Conditionals Method to print out (a-b) if a>b, (b-a) if b>a, or (a+b) if a=b
    public void calc() {
        if (a > b) {
            System.out.println(a - b);
        }
        else if (a < b){
            System.out.println(b - a);
        }
        else {
            System.out.println(a + b);
        }
    }
}
