package Week_2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Which direction would you like to convert? C to F or F to C?");
        String conversion_type = user_input.nextLine().toUpperCase();
        // ask for the temperature ot convert
        System.out.println("What is the temperature?");
        double temp = Double.parseDouble(user_input.nextLine());
        // F to C (F - 32) / 1.8 = C // C to F: (C * 1.8) + 32
        if (conversion_type.equalsIgnoreCase("F to C")) {
            double fToC = (temp - 32) / 1.8;
            System.out.println("The temperature from fahrenheit to celsius is " + fToC);
        } else if (conversion_type.equalsIgnoreCase("C to F")) {
            double cToF = (temp * 1.8) + 32;
            System.out.println("The temperature from celsius to fahrenheit is " + cToF);
        } else {
            System.out.println("Error");
        }

    }
}
