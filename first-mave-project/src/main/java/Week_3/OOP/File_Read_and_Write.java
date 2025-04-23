package Week_3.OOP;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Scanner;

public class File_Read_and_Write {

    public static void main(String[] args) {

        howManyWords();
    }

    // write a single file into a line
    public static void fileWriting() {
        try (FileWriter fw = new FileWriter("output.txt")) {
            File file;
            fw.write("this is a line of text");
        } catch (IOException e) {
            System.out.println("Error message: " + e.getMessage());
        }

    }

    // read that line back from output.txt and print the line to the console
    public static void fileReading() {
        try (BufferedReader readFile = new BufferedReader(new FileReader("output.txt"))) {
            String line = readFile.readLine();
            System.out.println(line);
            readFile.close();
        } catch (IOException a) {
            a.printStackTrace();
        }
    }

    // Create a String[] with lines of text like a short poem.
// Write all lines to a file, one per line
    public static void multipleLinesArray() {
        String[] poem2 = {"Roses", "are", "my", "favorite"};
        try {
            FileWriter fw2 = new FileWriter("poem2.txt");
            for (int i = 0; i < poem2.length; i++) {
                fw2.write(poem2[i] + "\n");
            }
            fw2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // read file line-by-line and print. use BufferedReader to read your poem back, line by line.
    public static void readPoemBack() {
        try {
            BufferedReader readFile = new BufferedReader(new FileReader("poem2.txt"));
            String line;
            while ((line = readFile.readLine()) != null) {
                System.out.println(line);
            }
            readFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ask the user for lines and save to a file
    public static void linesInAFile() {
        Scanner user_input = new Scanner(System.in);
        try {
            FileWriter addNew = new FileWriter("user_text.txt");
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter a sentence " + (i + 1) + ": ");
                String user_sentence = user_input.nextLine();
                addNew.write(user_sentence + "\n");

            }
            addNew.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // count how many times a word appears in a file
    public static void howManyWords() {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String user_word = user_input.nextLine().toLowerCase(); // don't really need .toLowerCase()

        try {
            BufferedReader readFile = new BufferedReader(new FileReader("poem2.txt"));
            int count = 0;
            String line; //this is to store the line being read
            while ((line = readFile.readLine()) != null) {
                if (line.contains(user_word))
                    count++;
            }
            readFile.close();
            System.out.println("The file contains " + user_word + " " + count + " times.");
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }


    }
}
