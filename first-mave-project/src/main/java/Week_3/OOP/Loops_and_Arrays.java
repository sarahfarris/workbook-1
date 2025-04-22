package Week_3.OOP;

public class Loops_and_Arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int counter = numbers.length;
//        for (int i = 0; i < numbers.length;i++) {
//            System.out.println(numbers[i]);
//        }

        // count backwards with a while loop

//        while (counter > 0) {
//            System.out.println(counter--);
//        }
//
        // greet each person
        String[] names = {"Alice", "Sarah", "Bob"};
        int counter2 = names.length;
        for (int i = 0; i > names.length; i++) {
            System.out.println("Hello, " + names[0]);
        }
    }
}