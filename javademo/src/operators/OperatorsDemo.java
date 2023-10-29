package operators;

public class OperatorsDemo {


    public static void main(String[] args) {
        int a= 5 , b= 11, c =20, d=10;

        //Airthmatic operators
        System.out.println("Addition of " + a + " and " + b + " = " +(a+b));
        System.out.println("Subtraction of " + a + " and " + b + " = " +(a-b));
        System.out.println("Multiplication of " + a + " and " + b + " = " +(a*b));
        System.out.println("Division of " + a + " and " + b + " = " +(b/a));
        System.out.println("modulus of " + a + " and " + b + " = " +(b%a));
        System.out.println("Increment of " +(++a));
        System.out.println("Decrement of " +(--b));


        //Logical operators

        boolean result =  b>a && b>c;  //false
        boolean result1 = b>a && c>b;    //true
        System.out.println(result);
        System.out.println(result1);


        boolean logicalor = b>a || b>c;
        boolean logicalor1 = b==a || b>c;


        System.out.println(logicalor);
        System.out.println(logicalor1);

        boolean logicalnot = !(c==a);
        boolean logicalnot1 = !(c>a);

        System.out.println("********************");
        System.out.println(logicalnot);
        System.out.println(logicalnot1);


        //Relational Operators
        boolean answer = (a==b);
        System.out.println(answer);

        boolean answer1 = (c>a);
        System.out.println(answer1);

        boolean answer2 = (a<b);
        System.out.println(answer2);

        boolean answer3 = (b==d);
        System.out.println(answer3);

    }
}
