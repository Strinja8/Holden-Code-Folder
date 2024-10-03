/*Bigger or Smaller number calculator
 * Holden Strinja
 * October 3, 2024
 * The Program gets two numbers from the user. It then takes the two numbers to see if the first number is bigger, smaller, or equal to the second number. If bigger, output is Yes.
 * If smaller, output is no. If equal, output is Equal. */

public class BigSmall {
    public static void main(String[] args) throws Exception {
        BigSmallRunner BoS = new BigSmallRunner();
        
        //Running both the "input" and "check" methods
        BoS.input();
        BoS.check();
    }
}