package Week_2.OOP1;

public class Car {
  static String latinName = "autocinetum";
  String color;
  String make;
  String model;
  int mpg;
  int year;

  public void startEngine() {
    System.out.println(
        "Starting the " + year + make + model + " that gets " + mpg + " miles per gallon.");
  }
}
