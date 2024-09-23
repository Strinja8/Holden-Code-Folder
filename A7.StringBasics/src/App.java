public class App {
    public static void main(String[] args) throws Exception {
 {
/*Sentence Word Remover and Adder
 * Holden Strinja
 * September 23, 2024
 * The program takes a given sentence, and removes a chosen word as well as
 * being able to add different words to replace the removed word
 */
// Assingment Set up (Defining Strings)
        String message1 = "I am very happy!";
        String target1 = "very";

        String message2 = "That was great - lol.";
        String target2 = "lol";
// Part One of Assingment
        int firNum = message1.indexOf(target1);
        int numLen = (firNum + target1.length()) + 1;
        int secNum = message1.length();
        System.out.println(message1.substring(0,firNum) + message1.substring(numLen,secNum));
// Part Two of assingment
        int remWord = message2.indexOf(target2);
        int lenWord = remWord + target2.length();
        int lineLen = message2.length();
         String newLine = message2.substring(0,remWord) + message2.substring(lenWord,lineLen);
        String newWord = "Laugh out Loud.";
        System.out.println(newLine + newWord);
}   }
}
