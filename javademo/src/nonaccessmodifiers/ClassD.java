package nonaccessmodifiers;

public class ClassD extends ClassC {

    public static void main(String[] args) {
        ClassC d = new ClassC();
        System.out.println(d.name);
        d.m1();
    }
}
