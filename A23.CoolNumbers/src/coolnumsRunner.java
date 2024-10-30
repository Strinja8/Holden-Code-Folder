import java.util.Scanner;

public class coolnumsRunner {

    Scanner nums = new Scanner(System.in);
    int max, count;

    public void setnums() {
        System.out.print("\nEnter in your Maximum Number: ");
        max = nums.nextInt();
    }

    public void calc() {
        for (int i = 6; i < max; i++) {
            if (i % 3 == 1 && i % 4 == 1 && i % 5 == 1 && i % 6 == 1) {
                count++;
            }
        }
    }

    public void print() {
        System.out.println("There are " + count + " cool numbers between 6 - " + max);
        count = 0;
    }
}
