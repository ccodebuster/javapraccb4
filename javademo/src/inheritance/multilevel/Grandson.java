package inheritance.multilevel;

public class Grandson extends Son{

    public void m3(){  //Instance method
        System.out.println("Child Of class Father contain m3 method");
    }
    public static void Multiplication(){  //Static method
        int a = 100, b =50;
        int c = a*b;
        System.out.println("Multiplication of a and b : " +c);
    }

    public static void main(String[] args) {
        Grandson s= new Grandson();

        s.m1();   //calling instance method using object from Father class
        s.m2();   //calling instance method using object from Son class
        s.m3();   //calling instance method using object from Grandson class
        addition();  //calling static method directly from Father class
        subtraction(); //calling static method directly from Son class
        Multiplication();  //calling static method directly from Grandson class
    }
}
