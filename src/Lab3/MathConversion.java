package Lab3;

import java.util.Scanner;

public class MathConversion {
    public static void main ( String [] arg){
     Scanner input = new Scanner (System.in);
        System.out.println("Enter a measurement in centimeters");
        double value = input.nextDouble();

        final double CENTIMETER_TO_FEET = 2.54;
        double res = value * CENTIMETER_TO_FEET;
        System.out.println("The value in feet = " + res);

        double FEET_TO_INCH = 12 ;
        double res1 = res * FEET_TO_INCH;
        System.out.println("The value in inch = " + res1);




}
}
