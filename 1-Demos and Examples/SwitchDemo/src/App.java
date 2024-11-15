import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        int option = 0;

        System.out.print("Please select a number: ");
        option = inp.nextInt();

        switch (option) {
            case 7: 
                System.out.println("You Picked 7!");
                break;
            case 6:
                System.out.println("You Picked 6!");
                break;
            case 5:
                System.out.println("You Picked 5!");
                break;
            default:
                System.out.println("You Picked a Weird Number.");
        }
    }
}
