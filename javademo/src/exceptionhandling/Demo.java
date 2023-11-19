package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Subscription Manager:");
        System.out.println("\n1. Enter new Subscription");
        System.out.println("2. Display Summary of subscriptions");
        System.out.println("3. Display Summary of subscription for Selected Month");
        System.out.println("4. Find and display subscription");
        System.out.println("0. Exit");
        System.out.print("Please choose one of the options to proceed:");

        try {
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Enter new Subscription");
                    break;

                case 2:
                    System.out.println("2. Display Summary of subscriptions");
                    break;

                case 3:
                    System.out.println("3. Display Summary of subscription for Selected Month");
                    break;

                case 4:
                    System.out.println("4. Find and display subscription");
                    break;

                case 0:
                    System.out.println("Exiting Program...");
                    System.out.println("Goodbye!");
                    System.exit(1);
                    break;

                default:
                    System.out.println("ERROR. Enter a selection from the options to continue!");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter a numerical value!");

        }
    }

}
