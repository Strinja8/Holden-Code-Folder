import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        Random rand = new Random();
        int numRolls;
        int[] outcomes;
        int current;


        System.out.print("How many dice would you want to Roll?: ");
        numRolls = keys.nextInt();
        outcomes = new int[numRolls]; //creating a postition for each dice roll

        for (int roll = 0; roll < numRolls; roll++) {
            //Rolling "Two" dice - note nextInt(x) is a number from 0 < num < x
            
            current = rand.nextInt(6) + 1;
            outcomes[roll] = current;
            System.out.println("Roll number " + (roll+1) + " is " + outcomes[roll]);
        }

        System.out.println("\nThe Game Stats");
        System.out.println("--------------");
        int total = 0;
        double average = 0;
        for (int i = 0; i < numRolls; i++) {
            total = total + outcomes[i];
        }
        average = (double) total / numRolls;

        System.out.println("Total Score: " + total);
        System.out.printf("Average Score: " + average);
        System.out.println();
        System.out.println( Arrays.toString(outcomes) );
    }
}
