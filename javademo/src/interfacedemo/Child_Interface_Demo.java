package interfacedemo;

//When we create Interface we need to used implements keyword

public class Child_Interface_Demo implements Interface_Demo {
    int a =10, b= 10;
    @Override
    public void addition() {

        System.out.println("Addition : " +(a+b));
    }

    @Override
    public void subtraction() {

        System.out.println("Subtraction : " +(a-b));
    }

    @Override
    public void Multi() {

        System.out.println("Multi : " +(a*b));
    }

    public static void main(String[] args) {
        Child_Interface_Demo c = new Child_Interface_Demo();
        c.addition();
        c.Multi();
        c.subtraction();
    }
}
