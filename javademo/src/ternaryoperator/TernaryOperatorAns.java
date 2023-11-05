package ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorAns {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER");
        int number = scanner.nextInt();

        String result = (number%2==0)? "Even" : "Odd";
        System.out.println(number + " is " + result);

    }
}
