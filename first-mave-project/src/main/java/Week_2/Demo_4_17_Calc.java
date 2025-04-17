package Week_2;
import java.util.Scanner;

public class Demo_4_17_Calc {
    static Scanner user_input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        double first_number = Double.parseDouble(user_input.nextLine());
        System.out.println("Enter the second number: ");
        double second_number = Double.parseDouble(user_input.nextLine());
        System.out.println("Choose an operator: +, -, *, /, : ");
        String op = user_input.nextLine();
        double result = calculate(first_number, second_number, op);
        System.out.println("Result: " + result);
    }
        public static double calculate(double first_number,double second_number,String op) {
            if (op.equals("+")) return first_number + second_number;
            else if (op.equals("-")) return first_number - second_number;
            else if (op.equals("*")) return first_number * second_number;
            else if (op.equals("/")) return first_number / second_number;
            else {
                System.out.println("Unknown operator!");
                return 0;
            }



        }
    }
