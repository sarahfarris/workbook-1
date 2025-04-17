package Week_2;

import java.util.Scanner;

public class Sentence_Analysis_4_17 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String user_sentence = user_input.nextLine();
        int user_sentence_length = user_sentence.length();
        System.out.println("The sentence has " + user_sentence_length + " characters");
        String[] words = user_sentence.split(" ");
        int wordCount = words.length;
        System.out.println("The sentence has " + wordCount + " words.");
        // print out the number of uppercase letters using countUppercaseLetter
        if (user_sentence.length() > 0) {
            System.out.println("The sentence starts with " + user_sentence.charAt(0));
            System.out.println("The sentence ends with " + user_sentence.charAt(user_sentence.length() - 1));
        }

    }
}
