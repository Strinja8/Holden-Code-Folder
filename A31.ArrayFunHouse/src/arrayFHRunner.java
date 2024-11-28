import java.util.Arrays;

public class arrayFHRunner {
    
    int[] one = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
    int[] two = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};
    int sum, counter;

public void getsum(int[] numArray, int start, int stop) {
    for (int i = start; i <= stop; i++) {
        sum += numArray[i];
    }
    System.out.println("The Sum of Numbers " + start + "-" + stop + " is: " + sum);
}  

public void count(int[] numArray, int value) {
    for (int i = 0; i <= numArray.length-1; i++) {
        if (numArray[i] == 0) {
            counter++;
        }
    }
    System.out.println("# of " + value + "s = " + counter);
}
}



