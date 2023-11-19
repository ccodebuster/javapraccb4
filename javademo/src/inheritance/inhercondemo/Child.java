package inheritance.inhercondemo;

import nonaccessmodifiers.ClassC;

public class Child extends Parent {

    Child(){
        super();
        System.out.println("child constructor");
    }

    void childMethod(){
        System.out.println("child method");
    }

    void callParentConstructor(){
        super.display();

    }

    public static void main(String[] args) {
      //  Child c = new Child();
        Parent p = new Parent();
        p.display();
    }




}
