package nonaccessmodifiers;

public class ClassD extends ClassC {

   static String street ="king";
    public static void main(String[] args) {
        ClassC d = new ClassC();
        System.out.println(d.name);
        System.out.println(street);
        System.out.println(d.city);
        d.m1();
    }
}
