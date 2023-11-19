import java.util.Scanner;

public class TryCatchDemo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            System.out.print("Enter the first value: ");
            double value1 = scanner.nextDouble();

            System.out.print("Enter the second value: ");
            double value2 = scanner.nextDouble();

            double result = performOperation(value1, value2, operation);
            System.out.println("Result: " + result);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Close the scanner to prevent resource leaks
            scanner.close();
        }
    }

    // Method to perform division
    private static double performOperation(double value1, double value2, char operation) {
        double result = 0;
        try {
            switch (operation) {
                case '+':
                    result = value1 + value2;
                    break;
                case '-':
                    result = value1 - value2;
                    break;
                case '*':
                    result = value1 * value2;
                    break;
                case '/':
                    // Check if the denominator is zero
                    result = value1 / value2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operation. Please use +, -, *, or /.");
            }
        } catch (ArithmeticException | IllegalArgumentException e) {
            // Catch specific exceptions
            throw e;
        } catch (Exception e) {
            // Catch any other unexpected exceptions
            throw new RuntimeException("An unexpected error occurred: " + e.getMessage());
        }
        return result;
    }

    // Method to perform division with try-catch for division by zero
    private static double divide(double numerator, double denominator) {
        try {
            if (denominator == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }
            return numerator / denominator;
        } catch (ArithmeticException e) {
            throw e; // Re-throw the exception for handling in the calling method
        }
    }
}
