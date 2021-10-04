package ClassExercise;

public class Nested {
    public static void main(String[] args) {
        int testScore = 80, studentAge = 5;

        if (testScore >= 70) { // if it is true it excutes every thing if not it executes the last else
            if (studentAge < 10) {
                System.out.println("You did a great job");
            } else {
                System.out.println("You did pass"); //test score >= 70
            } //and age >= 10
        } else { //test score < 70
            System.out.println("You did not pass");

        }

    }
}
