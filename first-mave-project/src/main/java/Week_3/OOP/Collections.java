package Week_3.OOP;

import Week_2.OOP2.Book;

import java.util.ArrayList;
import java.util.List;



public class Collections {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("axolotl");
        animals.add("red panda");
        animals.remove(2);
        animals.add("birds");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
        ArrayList<Integer> favoriteNumbers = new ArrayList<Integer>();
        favoriteNumbers.add(3);
        favoriteNumbers.add(7);
        favoriteNumbers.add(23);
        favoriteNumbers.remove(0);
        favoriteNumbers.add(12);
        int sumOfFaveNumbers = favoriteNumbers.get(0) + favoriteNumbers.get(1) + favoriteNumbers.get(2);

        for (int i = 0; i < favoriteNumbers.size(); i++) {
            System.out.println(favoriteNumbers.get(i));
        }
        System.out.println(sumOfFaveNumbers);

        ArrayList<Book_Object> books = new ArrayList<Book_Object>();
        books.add(new Book_Object("yearbook", "classes"));


    }


}
