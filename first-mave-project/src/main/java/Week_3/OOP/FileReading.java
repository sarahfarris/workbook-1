package Week_3.OOP;

import java.io.*;

public class FileReading {
    public static void main(String[] args) {
//write a single line to a file
        try (FileWriter newFile = new FileWriter("output.txt")) {
            newFile.write("lalalal");
        } catch (IOException e) {
            System.out.println("Error message: " + e.getMessage());
        }
        readSingleLine();

    }

    public static void readSingleLine() {
        try {
            BufferedReader readFile = new BufferedReader(new FileReader("output.txt"));
            String line = readFile.readLine();
            System.out.println(line);
            readFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}