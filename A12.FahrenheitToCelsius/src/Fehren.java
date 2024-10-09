/*Fehrenheit to Celsisus Tempurature Converter
Holden Strinja
October 9, 2024
The Program asks for a tempurature in Fehrenheit, it then converts the fehrenheit tempurature to a celsisus tempurature and then prints out the new
tepurature in celsius
 */

import java.util.Scanner;

public class Fehren {

    // Creating Scanner and fehrenheit varible
    Scanner temp = new Scanner(System.in);
    double fehr = 0.0;
    
    // Method to get a fehrenheit tempurature from the user
    public void setF() {
        System.out.print("Enter Your Tempurature in Fehrenheit: ");
        fehr = temp.nextDouble();
    }

    // Method doing the calculation to convert fehrenheit to celsius
    public double getC() {
        double cels = 0.0;
        cels = ((fehr-32)*5)/9;
        return cels;
    }

    // Method to print out the new celsius value
    public void print() {
        System.out.printf(fehr + " Degrees fehrenheit is " + getC() + " Degrees Celsisus");
    }
}
