package Week_1;

import java.util.Scanner;

public class Payroll_Calc {
    public static void main(String[] args) {
        // create scanner object
        Scanner scanner = new Scanner(System.in);

        // get name
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        //hours worked
        System.out.println("Enter hours worked, please: ");
        double hours_worked = scanner.nextDouble();

        //Pay rate
        System.out.println("Please enter pay rate: ");
        double payRate = scanner.nextDouble();

        //calc gross pay
        double grossPay = hours_worked * payRate;

        //display name + pay
        System.out.println(name + " has " + grossPay + "as a salary");
    }
}

