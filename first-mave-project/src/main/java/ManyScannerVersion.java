import java.util.Scanner;

public class ManyScannerVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome traveler, solve 3 riddles:");
        askRiddleOne(scanner);
        System.out.println("You have passed the gate!");

        scanner.close();

    }

    public static void askRiddleOne(Scanner scanner) {
        scanner = new Scanner(System.in);
        System.out.println("I speak without a mouth and hear without ears");
        String answer = scanner.nextLine().toLowerCase();
        if (answer.contains("echo")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }
    }
}
