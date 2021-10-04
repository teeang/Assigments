package Lab4;

import java.util.Scanner;

public class WeightConverter {

    private double moonWeight;
    private static final double MOONS_GRAVITY = 0.167;

    public static void weightConvert(double earthWeight) {
        Double weightOnMoon = earthWeight * MOONS_GRAVITY;
        System.out.println("Your weight on the moon is: "+ weightOnMoon);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight on earth.");
        double weight = input.nextDouble();
        weightConvert(weight);



    }
}