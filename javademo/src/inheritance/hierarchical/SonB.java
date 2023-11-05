package inheritance.hierarchical;

public class SonB extends Parent {

    public void m3(){
        System.out.println("contains Child class methods");
    }

    public void multi(){
        int a =5, b= 10;
        int c = a * b;
        System.out.println("Multi : " +c);
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.m1();
        p.addition();
        SonB b = new SonB();
        b.m3();
        b.addition();
        b.m1();
        b.multi();
    }
}
