import java.util.Scanner;

public class BigSmallRunner {
    // Creating our runner and defining our two integer varibles
    Scanner nums = new Scanner(System.in);
    private int num1 = 0;
    private int num2 = 0;
    
    // Input runner to get two numbers from the user
    public void input(){
    System.out.print("Enter Your First Number: ");
        num1 = nums.nextInt();
    System.out.print("Enter Your Second Number: ");
        num2 = nums.nextInt();
    }

    // Checker to see if the first number is bigger, smaller, or equal to the second number
    public void check(){
        if (num1 > num2){
            System.out.println("Yes! Number 1 (" + num1 + ") is Bigger then Number 2 (" + num2 + ")!");
        }
        if (num1 < num2){
            System.out.println("no. Number 1 (" + num1 + ") is Smaller then Number 2 (" + num2 + ").");
        }
        if (num1 == num2){
            System.out.println("Equal? Number 1 (" + num1 + ") is The Same as Number 2 (" + num2 + ")?");
    }
}}