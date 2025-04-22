import java.util.Scanner;

static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {


    // prompt for size
    System.out.println("Do you want regular or large?");
    int sizeOfSandwich = scanner.nextInt();
    // prompt for age
    System.out.println("What is your age?");
    int age = scanner.nextInt();
    //calculate price
    double totalPrice = 0;
    if (sizeOfSandwich == 1) {
        totalPrice = 5.45;
    } else if (sizeOfSandwich == 2) {
        totalPrice = 8.95;
    }
    if (age <= 17) {
        totalPrice *= 0.9;
    } else if (age >= 65) {
        totalPrice *= 0.8;
    }
    // display costs
    System.out.println("The total costs are " + totalPrice);
}