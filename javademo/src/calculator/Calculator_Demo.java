package calculator;

import accessmodifiers.ClassAPublic;
import accessmodifiers.ClassCDefault;

public class Calculator_Demo {
    public static void main(String [] args){
        int a = 10;
        int b = 5;
       int c;
       String name= "code";
       String name2= "buster";

        System.out.println(a);
//        System.out.println(c=a+b);
//        System.out.println(c=a-b);
//        System.out.println(c=a*b);
//        System.out.println(c=a/b);
        System.out.println("------------------abcd***++-----------------------");

        System.out.println("Sum of a+b is = " + (a+b));
        System.out.println("Expected output = "+(a-b));
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(name.concat(name2));


    }
}
