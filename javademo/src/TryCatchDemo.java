import java.util.Scanner;

public class TryCatchDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            double numerator = scanner.nextDouble();

            System.out.print("Enter the denominator: ");
            double denominator = scanner.nextDouble();

            // Check if the denominator is zero
            if (denominator == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }

            double result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);

        } catch (java.util.InputMismatchException e ) {
            System.out.println("Invalid input. Please enter numeric values.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner to prevent resource leaks
            scanner.close();
        }
    }

    // Method to perform division
    private static double divide(double numerator, double denominator) {
        return numerator / denominator;
    }
}
