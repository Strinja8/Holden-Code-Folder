public class App {
    public static void main(String[] args) throws Exception {
        
        randomNumbers rn = new randomNumbers();

        //Running the Code
        for (int i = 10; i > 0; i--) { //For Loop to print out program 10 times
            rn.setnums(); 
            rn.calc();
            System.out.println(); //Blank line to divide each run of the program
        }
  
    }
}
