import java.util.Scanner;

public class GeometryRunner {
    public static void main(String[] args) throws Exception {
        Geometry geo = new Geometry();
        int x = 0;
        Scanner calc = new Scanner(System.in);
        System.out.print("Do you want to calculate Perimeter (1), Surface Area (2), or the Area of a Circle (3)? ");
        x = calc.nextInt();
        if (x == 1)
        geo.perimeter(2, 7);
        if (x == 2)
        geo.surfArea(6);
        if (x== 3)
        geo.circArea(9);
        
        
    }
}
