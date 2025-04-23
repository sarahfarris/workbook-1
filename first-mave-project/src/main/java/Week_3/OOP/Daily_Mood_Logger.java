package Week_3.OOP;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Daily_Mood_Logger {
    // ask user how they are feeling today
    // use LocalDate to record the date of the entry
    // save each entry to a file in the format: 2025-04-23: Happy
    // when the user chooses, show all previous mood entries

    static String moodLogPath = "mood_log.txt";
    static File moodFile = new File(moodLogPath);

    static Scanner user_input = new Scanner(System.in);

    public static void main(String[] args) {
        user_options();
    }
    public static void user_options() {
        System.out.println("What would you like to do?");
        String user_answer = user_input.nextLine();
        if (user_answer.equalsIgnoreCase("log a new mood")) {
            logNewMood();
        } else if (user_answer.equalsIgnoreCase("log a mood")) {
            logNewMood();
        } else if (user_answer.equalsIgnoreCase("log mood")) {
            logNewMood();
        } else if (user_answer.equalsIgnoreCase("view past moods")) {
            viewPastMoods();
        } else if (user_answer.equalsIgnoreCase("view moods")) {
            viewPastMoods();
        } else if (user_answer.equalsIgnoreCase("exit")) {
            System.out.println("Thank you for logging your mood today, have a great day!");
        }
    }

    public static void logNewMood() {
        System.out.println("How are you feeling today?");
        String user_answer = user_input.nextLine();
        try {
            FileWriter newMood = new FileWriter(moodFile);
            LocalDate ld = LocalDate.now();
            newMood.write(ld + ": " + user_answer + "\n");
            newMood.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        System.out.println("Thank you for logging your mood.");
        user_options();

    }

    public static void viewPastMoods() {
        try {
            BufferedReader readMoods = new BufferedReader(new FileReader(moodFile));
            String line;
            while ((line = readMoods.readLine()) != null) {
                System.out.println(line);
            }
            readMoods.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error with reading file.");
        }
    }
}
// create a method that asks how the user is feeling, and storing the answer
// in a variable
// store that variable in a file
// create a loop that allows the user to view past moods

// create loop that asks the user 3 choices:
// 1. Log in a new mood 2. View past moods 3. Exit