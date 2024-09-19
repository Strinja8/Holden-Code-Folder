public class App {
    /*Program name: Chicken Wing Calculator
     * Student Name: Holden Strinja
     * Date: Sept. 19, 2024
     * Program Description: Able to calculate how many chicken wings you can buy with a set amount of money you have and a set cost of each wing
     */
    public static void main(String[] args) throws Exception {
    double money = 4.75;
    double cost = 0.75;
     double total = 0;
    total = (money / cost);
    System.out.print("You can buy " + (int)total + " chicken wings if you have $" + money + " and each wing costs $" + cost + "!");
    }
}
