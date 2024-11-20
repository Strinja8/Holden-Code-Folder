/*
Random Number Generator
Holden Strinja
November 19, 2024
The program generates and displays two random integers, it then compares the two numbers and prints out which number is larger and which number is smaller
*/

import java.util.Random;

public class randomNumbers {
int num1, num2;

Random x = new Random(); 

//Method to get two random numbers
public void setnums() {
num1 = x.nextInt();
num2 = x.nextInt();
System.out.println("Here are two random numbers:\n" + num1 + " and " + num2);
}

//Method to print out the bigger and smaller number
public void calc() {
    if (num1 > num2) { //Conditional to decide which is bigger or smaller
        System.out.println("The Smallest is " + num2 + "\nThe Biggest is " + num1);
    }
    else {
        System.out.println("The Smallest is " + num1 + "\nThe Biggest is " + num2);
    }
}



}

