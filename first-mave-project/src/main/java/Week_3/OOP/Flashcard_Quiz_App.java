package Week_3.OOP;

import java.util.Scanner;

public class Flashcard_Quiz_App {
    static Scanner user_input = new Scanner(System.in);

    public static void main(String[] args) {
        Flashcard();
    }
// app shows a question
// wait for user answer
// tell user if they were correct
//after a few rounds, show them how many they got right

//Ingredients:
    // store a few questions and correct answers
    // loop through the questions one by one
    // show correct/incorrect immediately
    // after all questions, show: total questions, number correct, percentage
//Advice:
    // use String[], one for questions and one for answers and hard-code them
    // instead of 2 string[], you can create a class Flashcard that holds the questions and the answer and work with..
    //... a Flashcard[] instead

    public static void Flashcard() {
        String[] Flashcards = {"What is the largest ocean in the world?", "Pacific", "What is the largest continent in the world?", "Asia", "What is Sarah's favorite song?", "Pay No Mind by Madeon"};
        System.out.println(Flashcards[0]); //first question
        String user_answer1 = user_input.nextLine();
        int score = 0;
        if (user_answer1.equalsIgnoreCase(Flashcards[1])) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect.");
        }

        System.out.println(Flashcards[2]); //second question
        String user_answer2 = user_input.nextLine();
        if (user_answer2.equalsIgnoreCase(Flashcards[3])) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect.");
        }
        System.out.println(Flashcards[4]); // third question
        String user_answer3 = user_input.nextLine();
        if (user_answer3.equalsIgnoreCase(Flashcards[5])){
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect.");
        }
        System.out.println("Final score: " + score);
    }


}
