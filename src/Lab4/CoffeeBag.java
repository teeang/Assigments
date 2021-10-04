package Lab4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CoffeeBag {
    static final double PRICE_PER_LB = 5.99;
    static final double TAX_RATE = 7.25;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of coffee bags needed. ");
        int numberOfBags = input.nextInt();
        System.out.println("Enter Weight per bag in pounds. ");
        int bagWieght = input.nextInt();
        coffeePrice(bagWieght, numberOfBags);
    }

    public static void coffeePrice(int numberOfBags, int bagWieght) {

        System.out.println("Number of bags sold: " + numberOfBags);
        System.out.println("Weight per bag: " + bagWieght + " lb");
        System.out.println("Price per pound:  $" + PRICE_PER_LB);
        System.out.println("Sales tax: " + TAX_RATE + "%");

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        double totalPrice = bagWieght * numberOfBags * PRICE_PER_LB;
        double totalPriceWithTax = totalPrice + totalPrice * TAX_RATE/100 ;
        System.out.println("Total price : $" + decimalFormat.format(totalPriceWithTax));

    }

}




