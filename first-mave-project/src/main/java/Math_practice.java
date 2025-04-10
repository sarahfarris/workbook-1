import java.sql.SQLOutput;

public class Math_practice {
    public static void main(String[] args) {

        int num1 = -45;
        System.out.println(Math.abs(num1));

        int num2 = 99;
        int num3 = 23;
        System.out.println(Math.min(num2, num3));

        double num4 = 8.9;
        System.out.println(Math.floor(num4));

        double num5 = 5.2;
        System.out.println(Math.ceil(num5));

        double num6 = 9.6;
        System.out.println(Math.round(num6));

        double morningTemp = -3.7;
        double afternoonTemp = 12.4;
        double tempDiff = Math.abs(morningTemp - afternoonTemp);
        System.out.println(tempDiff);
        System.out.println(Math.max(morningTemp, afternoonTemp));
        System.out.println(Math.min(morningTemp, afternoonTemp));
        System.out.println(Math.round(afternoonTemp));
        System.out.println(Math.floor(morningTemp));

        double price = 10.876;
        System.out.printf("%.2f",price);

        int seconds = 320;
        int videoLength = seconds / 60;








    }
}
