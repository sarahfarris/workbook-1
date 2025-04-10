import java.sql.SQLOutput;

public class java_practice {
    public static void main(String[] args) {

      int people = 5;
      double grade = 99.98;
      char letterGrade = 'A';
      System.out.println(people + " people have a grade of " + grade + " which results in a grade of " + letterGrade);

      int classA = 10;
      int classB = 20;
        System.out.println("One class has " + classA + " and the other has " + classB + " people");

        int practice1 = 10;
        double practice2 = 2.5;
        // cast integer to a double
        double result = (double) practice1 / practice2;
        System.out.println(result);

        int age = 30;
        System.out.println("In 10 years I will be " + (age + 10));

        byte nr = 100;
        int result1 = nr + 28;
        System.out.println(result1);

        double value = 5.7;
        int intValue = (int) value;
        System.out.println(intValue);

        float nm4 = 2.78F;
        int nm5 = 5;
        double result2 = nm4 * nm5;
        System.out.println(result2);

        char grades = 'A';
        grades += 1;
        System.out.println(grades);

        int a = 9;
        int b = 2;
        double calc = (double) a / b;
        int calc2 = a % b;
        System.out.println(calc + " and " + calc2);

        double weight_in_kg = 53.433;
        double height_in_cm_sq = 1.5748;
        double BMI = weight_in_kg / (height_in_cm_sq * height_in_cm_sq);
        System.out.println(BMI);

        double weight_in_lbs = 117.8;
        double height_in_in = 62;
        double BMI2 = (weight_in_lbs * 703) / (height_in_in * height_in_in);
        System.out.println(BMI2);

        double aa = 4.4;
        double bb = 5.5;
        double cc = 6.6;
        double average = (aa + bb + cc) / 3;
        System.out.println(average);

        short dd = 3000;







    }

}
