package Week_2;

import java.util.Scanner;

public class Address_Builder {
    static Scanner user_input = new Scanner(System.in);
    public static void main(String[] args) {
        // prompt user for their billing and shipping addresses, but instead of changing the value of a string,
        // use StringBuilder to build the string that holds all the address info, then print
        //as the user inputs the info, you should use the StringBuilder .append() method to append
        // the new input to the string


        //step by step: prompt the user for their billing and shipping address
        //


        StringBuilder bill_add_info = new StringBuilder();
        String billing_address = user_input.nextLine();
        System.out.println("Please type your name: ");
        bill_add_info.append(user_input.nextLine() + "\n\n Billing Address: \n"); // how we did it in class
        System.out.println("Please type your street address: ");
        bill_add_info.append(user_input.nextLine() + "\n"); // enters output on next line
        bill_add_info.append(billing_address);
        bill_add_info.append(user_input.nextLine() + ", "); // input a comma, not sure if correct yet
        System.out.println("Please type your city: ");
        bill_add_info.append(billing_address);
        System.out.println("Please type your state: ");
        bill_add_info.append(billing_address);

        System.out.println("Please type your zip code: ");
        System.out.println("Please confirm your billing address is correct: " + billing_address);
    }


    }

