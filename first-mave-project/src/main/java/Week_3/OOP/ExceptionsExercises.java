package Week_3.OOP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsExercises {
    static Scanner user_input = new Scanner(System.in);

    public static void main(String[] args) {
        numberGame();


//        try {
//            System.out.println("Please enter a number: ");
//            int nr1 = user_input.nextInt();
//            System.out.println("Please enter another number: ");
//            int nr2 = user_input.nextInt();
//            double result = (double) nr1 / nr2;
//            System.out.println(result);
//        } catch (InputMismatchException a) {
//            System.out.println("That is not a number.");
//        }
    }

    public static int stringConversion() {
        try {
            System.out.println("Type out a number: ");
            int user_sentence = Integer.parseInt(user_input.nextLine());
            return user_sentence;
        } catch (NumberFormatException b) {
            System.out.println("Please type numbers only");
        }
        return 0;
    }

    public static void getAge() {
        System.out.println("Please enter your age: ");
        boolean ageSuccessfullyEntered = false;
        int age = -1;
        while (!ageSuccessfullyEntered) {
            try {
                age = Integer.parseInt(user_input.nextLine());
                System.out.println("Your age is : " + age);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number: ");
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number: ");
            }

        }

    }

    public static void numberGame() {
        int hardcodedNumber = 7;
        boolean userGuessedNr = true;
        while (true) {
            try {
                System.out.println("Please pick a number between 1 and 10: ");
                int randomNumber = Integer.parseInt(user_input.nextLine());
                if (randomNumber == hardcodedNumber) {
                    System.out.println("You guessed the number!");
                    break;
                } else {
                    System.out.println("Try again");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a numeric digit.");
            }
        }
    }

    public static void temperatureConverter() {
        double temp1 = user_input.nextDouble();
        double temp2 = user_input.nextDouble();
        System.out.println("Would you like to convert from c to f, or f to c?");
        String user_answer = user_input.nextLine();
        if (user_answer.equalsIgnoreCase("c to f")) {

        }
    }
}

