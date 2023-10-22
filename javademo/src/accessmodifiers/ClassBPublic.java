package accessmodifiers;

public class ClassBPublic {

    public static void main(String[] args) {
        ClassCDefault c = new ClassCDefault();
        System.out.println(c.name);
        System.out.println(c.sur);
        ClassAPublic b = new ClassAPublic();
        System.out.println(b.name);
        System.out.println(b.name1);
    }

}
