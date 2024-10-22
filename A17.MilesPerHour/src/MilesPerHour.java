import java.util.Scanner;

public class MilesPerHour {
double D, MPH, H, M, TH = 0.0;
Scanner nums = new Scanner(System.in);

public void setinfo() {
System.out.print("Enter the Distance: ");
D = nums.nextDouble();
System.out.print("Enter the Hours: ");
H = nums.nextInt();
System.out.print("Enter the Minutes: ");
M = nums.nextInt();
}

public void calc() {
TH = H + (M/60);
MPH = D/TH;
}

public void print(){
    System.out.printf( D + " Miles in " + H + " hours and " + M + " minutes = " + MPH + " Miles Per Hour!");
}




}
