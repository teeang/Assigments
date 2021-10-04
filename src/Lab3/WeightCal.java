package Lab3;

import java.util.Scanner;

public class WeightCal {
    public static void main (String [] args){

        Scanner input = new Scanner (System.in);
        System.out.println("Enter the body weight");
        double bodyWeight = input.nextDouble();
        double calories = bodyWeight * 19 ;

        System.out.println("The calories needed for one day is : " + calories);

    }
}
