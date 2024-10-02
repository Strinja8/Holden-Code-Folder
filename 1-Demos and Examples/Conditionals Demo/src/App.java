public class App {
    public static void main(String[] args) throws Exception {
      int x = 2;
      int y = 3;
        // NOT (A & B) *Short Circut / Demorgans Law
        // (!(x > 0 && y < 2))
        //(!(x > 0) || !(y < 2))
    if (!(x > 0) || !(y < 2)) {
        System.out.println("Wear a Coat");
        System.out.println("Wear Gloves");}
 
      System.out.println("Bye Bye *Mario Accent*");
    }
}
