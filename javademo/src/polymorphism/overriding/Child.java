package polymorphism.overriding;

public class Child extends Parent{

    @Override
    public void printName(String name) {
        System.out.println(name);
    }

    @Override
    public void women() {
        System.out.println("Mother");
    }

    public void marry(){
        System.out.println("British Girl");
    }

  //  @Override
//    public void person() {
//        System.out.println("Father");
//    }

    public static void main(String[] args) {
        Child c =new Child();
        c.printName("Testing");
        c.women();
        c.person();
        c.marry();
    }
}



