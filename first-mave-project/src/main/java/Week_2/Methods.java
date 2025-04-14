package Week_2;

import java.io.InputStream;
import java.util.Scanner;

public class Methods   {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        printWelcomeMethod1();
        displayPlayerName(System.in);
        showLevel(1);
        attack("red", "blue");
        foundItem("dino_lover", "Health Potion");
        foundItem("cod_player1", "sword");
        foundItem("Your teammate", "pizza");
        foundItem("Your opponent", "shield");
        castSpell("Dark Mage", "Raise Undead", 60);
        castSpell("Paladin", "Healing Spell", 30);
        gameOver("Your Opponent");
        displayInventory("Sarah", 20);
        enterDungeon("cod_player1", "Minion Dungeon");
        enterDungeon("Dark Mage", "Dunce Dungeon");
        victoryDance("Sarah");
    }

    public static void printWelcomeMethod1() {
        System.out.println("Welcome to Code Quest!");
    }
    public static void displayPlayerName(InputStream in) {
        Scanner user_name = new Scanner(System.in);
        System.out.println("What is your player name?");
        String name = user_name.next();
        System.out.println("Player name: " + name);
    }
    public static void showLevel(int playerLevel) {
        System.out.println("Level: " + playerLevel);
    }
    public static void attack(String attacker, String target) {
        System.out.println(attacker + " attacks " + target);
    }
    public static void foundItem(String player, String item) {
        System.out.println(player + " found a " + item);
    }
    public static void castSpell(String wizard, String spellName, int manaCost) {
        System.out.println(wizard + " casts " + spellName + " costing " + manaCost + " mana!");
    }
    public static void gameOver(String player){
        System.out.println("GAME OVER for " + player);
    }
    public static void displayInventory(String player, int itemCount) {
        System.out.println(player + " has " + itemCount + " items in inventory.");
    }
    public static void enterDungeon(String player, String dungeonName) {
        System.out.println(player + " bravely enter the " + dungeonName);
    }
    public static void victoryDance(String name) {
        System.out.println(name + " does a little victory dance!");
    }

}
