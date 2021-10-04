package Lab3;

import java.util.Scanner;

public class TempConversion {
    public static void main ( String [] args){

        Scanner input = new Scanner (System.in);
        System.out.println("Enter the temperature in degree Celsius");
        double celsius = input.nextDouble();
        double Fahrenheit = 1.8 * celsius + 32 ;
        System.out.println("The temperature in degree Fahrenheit is = " + Fahrenheit);


    }
}
