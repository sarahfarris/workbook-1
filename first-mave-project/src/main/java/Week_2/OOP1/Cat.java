package Week_2.OOP1;

import java.util.Scanner;

public class Cat {

  static String latinName = "Felis catus";
  String name;
  String color;
  int age;
  boolean isFluffy;

  public void meow() {
    System.out.println(name + " says: Meow! (in a " + color + " coat)");
  }
}
