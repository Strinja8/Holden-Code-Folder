public class App {
    public static void main(String[] args) throws Exception {

        // int num = 3;

        // while (num > 0) {
        //     System.out.println(num);
        //     num --;  // num = num -1;
        // }


        // //Game loop or Program Loop

        // boolean game = true; // trigger variable

        // while (game) {
        //     //Program Code/Game Code/Calculations
        //     System.out.println("Hello Universe");

        //     //Kill Switch, play again method
        //     System.out.println("Do you want to play again?");
        //     String userinput = "no"; // getting user response

        //     if (userinput.equals("no")) {
        //         game = false; //trigger game to end
        //     }

            //Standard for loop
            //3 condtions
            //for (where we start; where we end; step size)
            for(int i = 10; i > 0; i--) {
                System.out.println("the number is " + i);
            }

        // equivilant while
        int x = 10;
        while (x > 0) {
            System.out.println("the number is " + x);
            x--;
        }
        }
    }

