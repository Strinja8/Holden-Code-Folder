import java.util.Scanner;
/*Integer and Double inputter and Calculator
Holden Strinja
September 24, 2024
The program asks for two integers and two doubles, it then displays both
integers and doubles and then prints the totals of the two integers
and two doubles*/

public class input {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        int intOne = 0;
        int intTwo = 0;
        double dOne = 0.0;
        double dTwo = 0.0;
        int intComb = 0;
        double dComb = 0.0;
       
        System.out.print("Enter an Integer: ");
        intOne = keys.nextInt();
        System.out.print("Enter an Integer: ");
        intTwo = keys.nextInt();
        System.out.print("Enter a Double: ");
        dOne = keys.nextDouble();
        System.out.print("Enter a Double: ");
        dTwo = keys.nextDouble();

        System.out.println("Integer one = " + intOne);
        System.out.println("Integer two = " + intTwo);
        System.out.println("Double one = " + dOne);
        System.out.println("Double two = " + dTwo );

        intComb = intOne + intTwo;
        System.out.println("Integer One + Integer Two = " + intComb);
        dComb = dOne + dTwo;
        System.out.println("Double One + Double Two = " + dComb);
    }
}