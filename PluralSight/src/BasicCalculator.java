import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Possible calculations:");
        System.out.println(" (A)dd");
        System.out.println(" (S)ubtract");
        System.out.println(" (M)ultiply");
        System.out.println(" (D)ivide");

        System.out.print("Please select an option: ");
        char operation = scanner.next().charAt(0);

        double result = 0;
        switch(operation) {
            case 'A':
            case 'a':
                result = num1 + num2;
                break;
            case 'S':
            case 's':
                result = num1 - num2;
                break;
            case 'M':
            case 'm':
                result = num1 * num2;
                break;
            case 'D':
            case 'd':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation selected!");
                return;
        }

        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
        scanner.close();
    }
}