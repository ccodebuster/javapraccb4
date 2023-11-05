package inheritance.hierarchical;

import inheritance.single.Son;

class SonA extends Parent {

    public static void main(String[] args) {

        SonA b = new SonA();
        //ClassA  a = new ClassA();
        b.addition();
        b.subtraction();
        b.m1();
        b.m2();
    }

    public void m2(){
        System.out.println("Child class contain m2 method");
    }
    public void subtraction(){
        int a = 100, b =50;
        int c = a-b;
        System.out.println("Subtraction of a and b : " +c);
    }


}
