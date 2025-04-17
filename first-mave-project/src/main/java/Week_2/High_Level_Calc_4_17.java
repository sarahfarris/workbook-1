package Week_2;

import java.util.Scanner;

public class High_Level_Calc_4_17 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter another number: ");
        double num2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter an operator (+, -, *, /): ");
        String op = scanner.nextLine();
        double result = Calculations(num1, num2, op);
        System.out.println("Result is: " + result);
        }
    public static double Calculations(double num1, double num2, String op) {
        if (op.equals("+")) return num1 + num2;
        else if (op.equals("-")) return num1 - num2;
        else if (op.equals("*")) return num1 * num2;
        else if (op.equals("/")) return num1 / num2;
        else {
            System.out.println("Unknown operator!");
            return 0;
        }

    }
}
