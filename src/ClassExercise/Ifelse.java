package ClassExercise;

import java.util.Scanner;

public class Ifelse {

    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      System.out.println("Enter your marital status.");
      String mstatus = input.next();
      System.out.println("Enter your annual salary.");
      int salary = input.nextInt();
        calcTaxRate(mstatus, salary);

    }

    public static void calcTaxRate(String x , int y) {
        if (y <= 40000 && x.equalsIgnoreCase("Single")) {
            System.out.println(" The tax rate is " + y * 10 / 100);
        } else if (y > 40000 && x.equalsIgnoreCase("Single")) {
            System.out.println("The tax rate is " + y * 18 / 100);
        } else if (y <= 40000 && x.equalsIgnoreCase("Married")) {
            System.out.println("The tax rate is " + y * 10 / 100);

        } else if (y > 40000 && x.equalsIgnoreCase("Married")) {
            System.out.println("The tax rate is " +  y * 18 / 100);

        }

    }
}
