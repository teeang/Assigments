package Lab2;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character of word/s.");
        String name = input.nextLine();

        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.substring(name.length()-1));




    }
}