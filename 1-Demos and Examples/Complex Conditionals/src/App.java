public class App {
    public static void main(String[] args) throws Exception {
        
        int x = 2;
        int y = 5;

        // if, else if, else statements
        if (x < 0) {
            System.out.println("x is negative");
        }
        else if (x == 0){
            System.out.println("x is zero");
        }

        else {
            System.out.println("x is positive");
        }
        
        
        // Nested and AND statements
        if ( x > 0 ) {
            if (x > y) {
                System.out.println("x is positive and greater than " + y);
            }
        }
        if (x > 0 && x > y) {
            System.out.println("x is positive and greater than " + y);
        }

       //ELSE IF and OR statements
        if (x < 0){
            System.out.println("Not a Winner");
        }
        else if (x > 5){
            System.out.println("Not a Winner");
        }
        else {
            System.out.println("Winner");
        }
        // equivilant
        if (x < 0 || x > 5) {
            System.out.println("Not a Winner");
        }
        else {
            System.out.println("winner");
        }
    }


    

}
