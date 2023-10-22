package nonaccessmodifiers;

public class ClassBFinal {

    final int a = 5;
    final String b = "code";
    public static void main(String[] args) {
        ClassBFinal c = new ClassBFinal();
        System.out.println(c.a);
        System.out.println(c.b);

    }

}
