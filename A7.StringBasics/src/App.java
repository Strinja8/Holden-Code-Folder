public class App {
    public static void main(String[] args) throws Exception {
 {

        String message1 = "I am very happy!";
        String target1 = "very";

        String message2 = "That was great - lol.";
        String target2 = "lol";

        int firNum = message1.indexOf("very");
        System.out.println(firNum);
        int numLen = firNum + "very ".length();
        System.out.println(numLen);
        int secNum = message1.length();
        System.out.println(secNum);
        System.out.println(message1.substring(0,firNum) + message1.substring(numLen,secNum));
}   }
}
