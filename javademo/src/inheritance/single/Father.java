package inheritance.single;

 public class Father {

    protected  String  name = "Codebuster";

    public static void main(String [] args){
        Father a = new Father();
        a.addition();
    }

    public void m1(){
        System.out.println("Parent class contain m1 method");
    }

    private void myName(){
        System.out.println("Java");
    }


    public static void addition(){
        int a = 100, b =200;
        int c = a+b;
        System.out.println("Addition of a and b :  " +c);

    }
}
