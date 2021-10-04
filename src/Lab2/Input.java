package Lab2;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Enter a word that has an odd number of characters.");
        String word = Keyboard.next();

        System.out.println("The middle character is:" + " " + word.charAt(word.length()/2) );

    }
}
