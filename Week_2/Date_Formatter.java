package Week_2;

import java.util.Scanner;
import java.time.LocalDate;
public class Date_Formatter {
    public static void main(String[] args) {
        // ask the user to enter a date yyy-MM-dd
        //ask user to choose how they'd like it displayed with 3 options
        // formats and prints the date in the chosen format
        // optional challenge, make it a static method: formatDate(String inputDate, String formatOption
        Scanner user_input = new Scanner(System.in);
        System.out.println("Please enter the date with yyyy-MM-dd format: ");
        String input = user_input.nextLine();

        System.out.println("How would you like your date displayed: yyyy-MM-dd, MM-dd-yyyy, or dd-MM-yyyy?");
        String date_format = user_input.nextLine();
        LocalDate date = LocalDate.parse(date_format);
        if (date_format.equals("yyyy-MM-dd")) {
            System.out.println(input);
        } else if (date_format.equals("MM-dd-yyy")) {


        }
    }
}
