package scannerclass;

import java.util.Scanner;

public class ScannerClassDemo {

    public static void main(String[] args) {
        int eMarks = 70, mMarks = 80;
        String name = "Java";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of English : " );
        int engmarks = sc.nextInt();

        System.out.println("Enter marks of Maths : " );
        int mathsmarks = sc.nextInt();



        System.out.println("Enter name : " );
        String name1 = sc.next();

    }
}
