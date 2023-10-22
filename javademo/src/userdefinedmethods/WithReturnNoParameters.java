package userdefinedmethods;

public class WithReturnNoParameters {

    static String surName = "patel";

    public static void main(String[] args) {
        WithReturnNoParameters m = new WithReturnNoParameters();
        System.out.println(m.name());
        System.out.println(m.sum());
        System.out.println(m.mix());

    }
    public String name() {
        String nam = "bhavesh";
        return nam;
    }

    public int sum() {
        int x = 5;
        int y = 6;
        int sumOfAAndB = x + y;
       // return sumOfAAndB;
        return  y;
    }

    public String mix() {

        return surName;
    }

}
