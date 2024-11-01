import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Defining variables, runner, and scanner
        coolnumsRunner cn = new coolnumsRunner();
        boolean game = true;
        Scanner choice = new Scanner(System.in);
        String x = "";
        
        //While loop running the program until ended by the user
        while (game) {
            //Program
            cn.setnums();
            cn.calc();
            cn.print();
            //Asks user if theyd want to go again
            System.out.println("Would you like to go again? (yes or no)"); 
            x = choice.next();
            //Conditional statement to exit the loop if chosen to stop playing
            if (x.equals("no") || x.equals("No") || x.equals("NO") || x.equals("n") || x.equals("N")) {
                System.out.println("Thank You For Playing!");
                game = false;
            }
        }
      
    }
}
