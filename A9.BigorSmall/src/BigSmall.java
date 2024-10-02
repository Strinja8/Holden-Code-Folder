import java.util.Scanner;

public class BigSmall {
    Scanner nums = new Scanner(System.in);
    private int num1 = 0;
    private int num2 = 0;

    public void input(){
    System.out.print("Enter Your First Number: ");
        num1 = nums.nextInt();
    System.out.print("Enter Your Second Number: ");
        num2 = nums.nextInt();
    }

    public void check(){
        if (num1 > num2){
            System.out.println("Your First Number (" + num1 + ") is Bigger then Your Second Number (" + num2 + ")!");
        }
        if (num1 < num2){
            System.out.println("Your First Number (" + num1 + ") is Smaller then Your Second Number (" + num2 + ").");
        }
        if (num1 == num2){
            System.out.println("Your First Number (" + num1 + ") is the same as Your Second Number (" + num2 + ")?");
    }
System.out.println("Bye Bye");
}}

