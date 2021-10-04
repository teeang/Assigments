package lab5;

import java.util.Scanner;

public class MathExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number. ");
        int number = input.nextInt();
        Math.pow(10, number);

        if (number == 6) {
            System.out.println("10^6 is Million");
        } else if (number == 9) {
            System.out.println("10^9 Billion");
        } else if (number == 12) {
            System.out.println("10^12 Trillion");
        } else if (number == 15) {
            System.out.println("10^15 Billion");
        } else if (number == 18) {
            System.out.println("10^18 Quadrillion");
        } else if (number == 21) {
            System.out.println("10^21 Quintillion");
        } else if (number == 30) {
            System.out.println("10^30 Sextillion");
        } else if (number == 100) {
            System.out.println("10^100 Googol");
        }

    }
}