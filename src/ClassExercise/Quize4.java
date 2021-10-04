package ClassExercise;

import java.util.Queue;
import java.util.Scanner;

public class Quize4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your annual salary");
        int salary = input.nextInt();
        printPriceCategory(salary);

    }

    public static void printPriceCategory(int wage ) {

        if (wage <= 70000) {
            System.out.println("Wage is Low");
        }
        else if (wage <= 220000) {
        System.out.println("Wage is medium");
    }
        else  {
            System.out.println("Wage is High ");

        }


    }
}





