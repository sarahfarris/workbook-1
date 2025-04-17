package Week_1;

import java.util.Random;
import java.util.Scanner;

public class Mini_Project_Exercises {
    public static void main(String[] args) {

        // Exercise 1
        Scanner user_input = new Scanner (System.in);
        System.out.println("What is your name? ");
        String name = user_input.next();
        System.out.println("Hello, " + name + ". " + "Welcome to the game!");

        // Exercise 2
        System.out.println("How old are you?");

        int age = user_input.nextInt() * 7;
        System.out.println("Your age in dog years is " + age);

        // Exercise 3
       int randomInt = (int) Math.floor(Math.random() * 6) + 1;
        System.out.println("Random dice roll " + randomInt);

        // Exercise 4
        user_input = new Scanner(System.in);
        System.out.println("What is your player name?");
        String player_name = user_input.next();
        System.out.println("What is your player's strength?");
        int player_strength = user_input.nextInt();
        System.out.println("What is your player's agility?");
        int player_agility = user_input.nextInt();
        System.out.println("Hero: " + player_name + " Strength: " + player_strength + " Agility: " + player_agility);
        user_input.nextLine();

        // Exercise 5
        System.out.println("What is your current level?");
        int current_level = Integer.parseInt(user_input.next());
        System.out.println("Current Level: " + current_level);
        current_level += 1;
        System.out.println("You leveled up! You are now level " + current_level);

        // Exercise 6
        System.out.println("How many gold did you acquire?");
        int gold_coins = user_input.nextInt();
        System.out.println("How many silver coins did you acquire?");
        int silver_coins = user_input.nextInt();
        int score = (gold_coins * 10) + silver_coins;
        System.out.println("You have acquired " + score + " points!");

        // Exercise 7
        int random_nm = (int) Math.floor(Math.random() * 6) + 1;
        if (random_nm % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        // Exercise 8 - Critical Hit Chance
        System.out.println("What is your luck stat?");
        int luck_stat = user_input.nextInt();
        if (luck_stat > 50) {
            System.out.println("Critical Hit!");
        } else {
            System.out.println("Normal Hit");
        }
        // Exercise 9 - Character Class Check
        System.out.println("What is your character class?");
        String char_class = user_input.next();
        if (char_class.equals("warrior")) {
            System.out.println("Your starting weapon is a sword.");
        } else if (char_class.equals("mage")) {
            System.out.println("Your starting weapon is a staff");
        }
        // Exercise 10 - Magic Number Guess
        int secret_number = 7;
        System.out.println("Guess a number");
        int guessed_number = user_input.nextInt();
        if (guessed_number == 7) {
            System.out.println("You guessed right!");
        } else {
            System.out.println("You lost!");
        }

        // Exercise 11 - Speed Trap
        System.out.println("How fast are you going?");
        int speed = user_input.nextInt();
        if (speed >= 100) {
            System.out.println("Too fast!");
        } else {
            System.out.println("Safe Speed");
        }

//        //Exercise 12

        String[] choices = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        int computer_move = random.nextInt(choices.length);
        String computer_move1 = choices[computer_move];

        System.out.println("Rock, paper or scissors?");
        String answer = user_input.nextLine();
        user_input.nextLine();

        random = new Random();
        if (answer.equals("rock") && computer_move1.equals("Rock")) {
            System.out.println("The computer chose rock, it's a tie!");
        } else if (answer.equals("rock") && computer_move1.equals("Paper")) {
            System.out.println("The computer chose Paper, paper beats rock!");
        } else if (answer.equals("rock") && computer_move1.equals("Scissors")) {
            System.out.println("The computer chose scissors, you win!");
        } else if (answer.equals("paper") && computer_move1.equals("Rock")) {
            System.out.println("The computer chose rock, you win!");
        } else if (answer.equals("paper") && computer_move1.equals("Paper")) {
            System.out.println("The computer chose paper, it's a tie!");
        } else if (answer.equals("paper") && computer_move1.equals("Scissors")) {
            System.out.println("The computer chose scissors, you lose!");
        } else if (answer.equals("scissors") && computer_move1.equals("Rock")) {
            System.out.println("The computer chose rock, you lose!");
        } else if (answer.equals("scissors") && computer_move1.equals("Paper")) {
            System.out.println("The computer chose paper, you win!");
        } else if (answer.equals("scissors") && computer_move1.equals("Scissors")) {
            System.out.println("The computer chose scissors, it's a tie!");
        }
// STILL STRUGGLING WITH SYNTAX AND USE OF RANDOM INPUT ON JAVA












    }
}
