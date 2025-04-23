package Week_3.OOP;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main(String[] args) {
        subtractThreeDays();
    }

    public static void localDate() {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
    }

    public static void specificDate() {
        LocalDate sd = LocalDate.of(1995, 3, 17);
        System.out.println(sd);
    }

    // print the year, month and day of a given LocalDate
    public static void partsOfDate() {
        LocalDate ld = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd");
        System.out.println(ld.getYear());
    }

    public static void getCurrentTime() {
        LocalDateTime ld = LocalDateTime.now();
        System.out.println(ld);
    }

    public static void specificTime() {
        LocalTime lt = LocalTime.of(15, 30);
        System.out.println(lt);
    }

    public static void partsOfTime() {
        LocalTime lt = LocalTime.now();
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
    }

    // combine a LocalDate and LocalTime to make a LocalDateTime
    public static void createDateTime() {
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.of(ld, lt);
        System.out.println(ldt);
    }

    public static void currentDT() {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
    }

    //add 1 week to today's date
    public static void addOneWeek() {
        LocalDate lt = LocalDate.now();
        System.out.println(lt.plusWeeks(1));
    }
    //subtract 3 days from a specific date
    public static void subtractThreeDays() {
        LocalDate lt = LocalDate.of(2022, 1, 3);
        System.out.println(lt.minusDays(3));
    }

}
