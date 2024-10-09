public class Geometry {
    private double P, SA, AC;
    
    public void perimeter(double L, double W){
        P = 2*(L+W);
        System.out.println("The Perimeter of the Rectangle is " + P);
    }
    public void surfArea(double S) {
        SA = 6*(S*S);
        System.out.println("The Surface Area of the cube is " + SA);
    }

    
    }
}
