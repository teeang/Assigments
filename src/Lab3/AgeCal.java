package Lab3;

import java.util.Scanner;

public class AgeCal {
    public static void main (String [] args){

        Scanner input = new Scanner (System.in);
        System.out.println("Enter the year you were born ");
        int bornYear = input.nextInt();
        System.out.println("Enter the current year");
        int currentYear = input.nextInt();

        int Age = currentYear - bornYear ;

        System.out.println("You were born in " + bornYear + " and will be " + Age + " this year.");

    }
}
