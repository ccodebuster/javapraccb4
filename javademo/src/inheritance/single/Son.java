package inheritance.single;

public class Son extends Father {
    private String name1 = "Java";

    public static void main(String[] args) {
        Son b = new Son();  //Create an object of child class

        b.addition();   //called static method directly from Parent class Father
        b.subtraction();  //called static method directly from Child class Son
        b.m1();  //called instance method directly from Parent class Father
        b.m2(); //called instance method directly from Child class Son

        //Print and concate the value of Private and protected Variables
        System.out.println(b.name + " " + b.name1);

    }
    public void m2() {
        System.out.println("Child class contain m2 method");
    }

    public static void subtraction() {
        int a = 100, b = 50;
        int c = a - b;
        System.out.println("Subtraction of a and b : " + c);
    }
}
