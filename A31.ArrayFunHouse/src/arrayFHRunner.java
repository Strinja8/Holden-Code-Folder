import java.util.Arrays;

public class arrayFHRunner {
    
    int[] a1 = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
    int[] b1 = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};
    int sum = 0;
    int fourcount = 0;
    int sevencount = 0;
    int ninecount = 0;
  
public void arrA() {
    for (int i = 0; i <= a1.length-1; i++) {
        sum = sum+a1[i];
        if (a1[i] == 4){
            fourcount++;
        }
        else if (a1[i] == 7) {
            sevencount++;
        }
        else if (a1[i] == 9) {
            ninecount++;
        }
    }
    System.out.println(Arrays.toString(a1));
    System.out.println("Sum of Array: " + sum);
    System.out.println("# of 4s: " + fourcount);
    System.out.println("# of 7s: " + sevencount);
    System.out.println("# of 9s: " + ninecount);
    }
    
}



