/*Triangle Area Calculator
Holden Strinja
October 15, 2024
The program gets three side lengths of a triangle, then uses those side lengths to enter in the area of that triangle
 */


import java.util.Scanner;
public class TriArea {
    
    // Variables and Scanner initialized
    double a, b, c, p, s, AREA = 0.0;
    Scanner side = new Scanner(System.in);   
    
    // Asking user for side lengths method
    public void nums(){
        System.out.print("Enter Side A: ");
        a = side.nextDouble();
        System.out.print("Enter Side B: ");
        b = side.nextDouble();
        System.out.print("Enter Side C: ");
        c = side.nextDouble();
    }

    // Calculations for area method
    public void calc(){
        p = a + b + c;
        s = p/2;
        AREA = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
    }
    
    // Final Print method
    public void print(){
        System.out.printf("Area of the Triangle = " + "%.3f",AREA + ".");
    }


    }
