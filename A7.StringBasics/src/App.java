public class App {
    public static void main(String[] args) throws Exception {
 {
// Assingment Set up (Defining Strings)
        String message1 = "I am very happy!";
        String target1 = "very";

        String message2 = "That was great - lol.";
        String target2 = "lol";
// Part One of Assingment
        int firNum = message1.indexOf("very");
        int numLen = firNum + "very ".length();
        int secNum = message1.length();
        System.out.println(message1.substring(0,firNum) + message1.substring(numLen,secNum));
// Part Two of assingment

}   }
}
