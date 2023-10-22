package userdefinedmethods;

public class NoReturnWithParameters {
    public static void main(String[] args) {
        NoReturnWithParameters m = new NoReturnWithParameters();
        m.name("bhavesh");
        m.sum(5, 6);
        m.sum(23, 48);

    }


    public void name(String nam) {
        System.out.println(nam);
    }

    public void sum(int x, int y) {
        System.out.println(x + y);
    }
}
