import java.util.Random;

public class randomNumbers {
int num1, num2;

Random x = new Random(); 

public void setnums() {
num1 = Math.abs(x.nextInt());
num2 = Math.abs(x.nextInt());
System.out.println("Here are two random numbers:\n" + num1 + " and " + num2);
}

public void calc() {
    if (num1 > num2) {
        System.out.println("The smallest is " + num2 + "\nThe Biggest is " + num1);
    }
    else {
        System.out.println("The smallest is " + num1 + "\nThe Biggest is " + num2);
    }
}



}

