package methods;

public class InstanceMethods {


    public static void main(String[] args) {
        System.out.println("code");
        InstanceMethods t = new InstanceMethods();
        t.m1(); // calling instance methods through object
        m2();

    }

    //instance methods
    public void m1(){
        System.out.println("buster");
        m2();
    }

    public static void m2(){
        InstanceMethods a = new InstanceMethods();
        a.m1();
        System.out.println("codeKnight");
    }




}
