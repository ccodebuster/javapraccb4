

public class Main {

     public String name = "code";
    static String name1 = "buster";

    public static void main(String[] args) {
        Main m = new Main();
        m.m1();
        m2();
        m3("codility","java");
        m3("selenium","Api");
    }
    public void m1() {

        try{
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println("wrong calculation");
        }

        System.out.println(name);
        System.out.println(name1);
        name1 = "buster2";
        System.out.println(name1);
    }
    public static void m2() {
        Main m = new Main();
        System.out.println(m.name);
        System.out.println(name1);
    }

    public static void m3(String course, String module) {
        System.out.println(course);
        System.out.println(module);
    }


}

