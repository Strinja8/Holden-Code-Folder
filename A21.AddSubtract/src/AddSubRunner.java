import java.util.Scanner;

public class AddSubRunner {


    Scanner nums = new Scanner(System.in);
    int a, b;

    public void setnums() {
        System.out.print("Enter a Number: ");
        a = nums.nextInt();
        System.out.print("Enter a Number: ");
        b = nums.nextInt();
    }

    public void calc() {
        if (a > b) {
            System.out.println(a - b);
        }
        else if (a < b){
            System.out.println(b - a);
        }
        else {
            System.out.println(a + b);
        }
    }
}
