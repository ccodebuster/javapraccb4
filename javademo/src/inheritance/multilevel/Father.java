package inheritance.multilevel;

import java.util.Scanner;

public class Father {
    String name = "Codebuster";


    public static void main(String[] args) {

        Father f = new Father();  //Create object of Parent class
        addition(); // called static method directly
        f.m1();  //called instance method using object
    }

    public  void m1 (){   //Instance method
        System.out.println("Parent Class contain m1 method");
    }

    public static void addition(){ //Declared static method

        Scanner sc = new Scanner(System.in);    //import Scanner class and create a scanner object

        System.out.println("Enter Value of A : " );  //print statement for input value A
        int a = sc.nextInt();            // Read user input value A
        System.out.println("Enter value of B : " ); //print statement for input value B
        int b = sc.nextInt();            // Read user input value B
        int c = a+b;

        //print statements
        System.out.println("A : "+a);
        System.out.println("B : "+b);
        System.out.println("Addition of a  and b is : "+c);

    }
}
