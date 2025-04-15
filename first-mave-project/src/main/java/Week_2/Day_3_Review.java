package Week_2;

import java.util.Scanner;

public class Day_3_Review {
  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int nr = getAgeUser();
        String username = getNameUser();
        System.out.println(nr + " " + username);
    }

    public static String getNameUser() {
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        scanner.close();
        return name;
    }

    public static int getAgeUser() {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        // scanner.close()
        if (age >= 0) {
            return age;
        } else {
            return -1;
        }

        }
    }

