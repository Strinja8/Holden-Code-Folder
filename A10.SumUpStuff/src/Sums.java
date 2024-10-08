/*Sum Calculator
Holden Strinja
October 8 2024
The program takes in two numbers from the user, then it adds the two numbers up and displays the total
 */

import java.util.Scanner;

public class Sums {
   Scanner nums = new Scanner(System.in);
   // Initializing Varibles
    double num1 = 0;
    double num2 = 0;
    double sum = 0;
   
    //getting our two numbers from the user
   public void setNums(){
    System.out.print("Enter Your First Number: ");
    num1 = nums.nextDouble();
    System.out.print("Enter Your Second Number: ");
    num2 = nums.nextDouble();
   }

   //Adding up and printing the sum of the two numbers
   public void sums() {
    sum = num1 + num2;
    System.out.println("The Sum of your numbers is " + sum + "!");
   }
    }

