package mokeexam;

import java.util.Random;
import java.util.Scanner;

public class RollDice1 {
   static Random input = new Random();

    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println ("Enter number of rolls");
        int nRoll = keyboard.nextInt();
        rollDice ( nRoll);

    }

    public static void rollDice(int nRolls) {

        for (int i = 1; i <= 2; i++) {
            int dice1 = input.nextInt(6) + 1;
            System.out.print(" " + dice1);
        }

    }
}