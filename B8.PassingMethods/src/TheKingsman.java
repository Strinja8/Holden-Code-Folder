/*Kingsman Information Displayer
 * Holden Strinja
 * October 1, 2024
 * Scanner pulls the "cast" and "funfacts" submethods from the kinginfo method to display the notable cast members of the film and a hand full of fun
 * facts pertaing towards the movie
 */

public class TheKingsman {
    public static void main(String[] args) throws Exception {
        kingsman KM = new kingsman(); // creating scanner

        KM.kingInfo(); // Scanner pulling the "kinginfo" method and printing the contents
    }
}
