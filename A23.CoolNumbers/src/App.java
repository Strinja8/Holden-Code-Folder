import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        coolnumsRunner cn = new coolnumsRunner();
        boolean game = true;
        Scanner choice = new Scanner(System.in);
        String x = "";
        
        while (game) {
            cn.setnums();
            cn.calc();
            cn.print();
            System.out.println("Would you like to play again? (yes or no)"); 
            x = choice.next();
            if (x.equals("no")) {
                game = false;
            }
        }
      
    }
}
