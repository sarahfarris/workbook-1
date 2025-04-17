package Week_2;

import java.util.Scanner;

public class Tip_calculator {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("What is the total bill amount?");
        double bill_amount = Double.parseDouble(user_input.nextLine());
        System.out.println("What percentage of tip would you like to leave? Please leave out the % ");
        double tip_percentage = Double.parseDouble(user_input.nextLine()) / 100;
        double total = bill_amount + (tip_percentage * bill_amount);
        double roundedUpTotal = Math.floor(total);
        System.out.println("The total of the bill is " + roundedUpTotal);
    }
}
