/*
Box Word
Holden Strinja
November 4, 2024
The program gets a word from a user, and it then prints out the word as many times as the length of that word.
 */


import java.util.Scanner;

public class BoxWord {

    //Creating variables and scanner
    Scanner w = new Scanner(System.in);
    String word = "";
    int x;

    //Method to get a word from the user
    public void setword() {
        System.out.print("Enter in a Word: ");
        word = w.next();
    }

    //Method to find the length of the word
    public void length() {
        x = word.length();
    }

    //Method to print out the word as many times as the length of the word
    public void print(){
        for (int i = 0; i < x; i++) { //Looping printing for the length
            System.out.println(word);
        }
    }
}
