package Week_1;

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









    }
}
