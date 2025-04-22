public class House {
    static String latinName = "domus";
    String color;
    int numberOfRooms;
    int numberOfBathrooms;
    boolean hasPool;
    boolean hasYard;
    double sizeInSquareFeet;

    public void openDoor() {
      System.out.println(
          "Opening the door of "
              + color
              + " house with "
              + numberOfRooms
              + " rooms, and "
              + numberOfBathrooms
              + " bath");

    }
  }

