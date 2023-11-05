package polymorphism.overriding;

public class Parent {


    public void printName(String name){
        System.out.println(name);
    }

    public void women(){
        System.out.println("Software Tester");
    }

    public void person(){
        System.out.println("Teacher");
    }

    public void marry(){
        System.out.println("Indian Girl");
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.printName("Java");
        p.person();
        p.women();
    }

}
