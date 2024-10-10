import java.util.Scanner;

public class Geometry {
    private double P, SA, AC;
    
    public void perimeter(double L, double W){
        P = 2*(L+W);
        System.out.printf("The Perimeter of the Rectangle is " + "%.2f",P);
    }
    public void surfArea(double S) {
        SA = 6*(S*S);
        System.out.printf("The Surface Area of the cube is " + "%.2f",SA);
    }

    public void circArea(double R){
        AC = Math.PI*(R*R);
        System.out.printf("The Area of the Circle is " + "%.3f",AC);
    }

    }

    
    
