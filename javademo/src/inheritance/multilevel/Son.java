package inheritance.multilevel;

public class Son extends Father {

    public static void main(String[] args) {
        Son b = new Son();  //Create an object of child class
        addition(); //called static method directly from Parent class Father
        subtraction(); //called static method directly from child class Son
        b.m1(); //called instance method directly from Parent class Father
        b.m2(); //called instance method directly from child class Son

    }

    public void m2(){  //Instance method
        System.out.println("Child class contain m2 method");
    }
    public static void subtraction(){  //Static method
        int a = 100, b =50;
        int c = a-b;
        System.out.println("Subtraction of a and b : " +c);
    }

}
