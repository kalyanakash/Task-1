import java.util.Scanner;

public class ConsoleCalculator {

    // Method for Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for Division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalculation = true;

        System.out.println("===== Java Console Calculator =====");

        while (continueCalculation) {
            System.out.print("\nEnter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.println("Choose operation (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            double result = 0;
            boolean validOperation = true;

            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator.");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("Result: " + result);
            }

            System.out.print("\nDo you want to perform another calculation? (yes/no): ");
            String choice = sc.next().toLowerCase();
            if (!choice.equals("yes")) {
                continueCalculation = false;
                System.out.println("Calculator exited.");
            }
        }

        sc.close();
    }
}
