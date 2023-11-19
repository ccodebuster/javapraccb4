package inheritance.hierarchical;

import inheritance.single.Father;

public class Parent {
    public static void main(String [] args){
       Parent a = new Parent();
        a.addition();
    }

    public void m1(){
        System.out.println("Parent class contain m1 method");
    }


    public void addition(){
        int a = 100, b =200;
        int c = a+b;
        System.out.println("Addition of a and b :  " +c);

    }
}
