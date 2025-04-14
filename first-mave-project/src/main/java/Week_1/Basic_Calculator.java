public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    double user_input = scanner.nextDouble();
    System.out.println();
    System.out.println("Enter the second number: ");
    double user_input2 = scanner.nextDouble();
    System.out.println();
    double result = user_input * user_input2;
    System.out.println(result);




}
public class Payroll_Calc {
    public static void main(String[] args) {
        // create scanner object
        Scanner scanner = new Scanner(System.in);

        // get name
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        //hours worked
        System.out.println("Enter hours worked, please: ");
        double hours_worked = scanner.nextDouble();

        //Pay rate
        System.out.println("Please enter pay rate: ");
        double payRate = scanner.nextDouble();

        //calc gross pay
        double grossPay = hours_worked * payRate;

        //display name + pay
        System.out.println(name + " has " + grossPay + "as a salary");
    }
}