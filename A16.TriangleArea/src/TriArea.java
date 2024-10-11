import java.util.Scanner;
public class TriArea {
    
    double a, b, c, p, s, AREA = 0.0;
    Scanner side = new Scanner(System.in);   
    
    public void nums(){
        System.out.print("Enter Side A: ");
        a = side.nextDouble();
        System.out.print("Enter Side B: ");
        b = side.nextDouble();
        System.out.print("Enter Side C: ");
        c = side.nextDouble();
    }

    public void calc(){
        p = a + b + c;
        s = p/2;
        AREA = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
    }
    public void print(){
        System.out.printf("Area of the Triangle = " + "%.3f",AREA);
    }


    }
