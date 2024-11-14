public class App {
    public static void main(String[] args) throws Exception {
        
        randomNumbers rn = new randomNumbers();

        for (int i = 10; i > 0; i--) {
            rn.setnums();
            rn.calc();
            System.out.println();
        }
  
    }
}
