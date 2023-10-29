package test;

public class Test {

   public static String name = "code";
  public   int number = 15;

    public static void main(String[] args) {
        Test num = new Test();
        num.m1();
        m2();


    }

    Test(){
        System.out.println("hi");
    }
    public  void  m1(){
        System.out.println(name);
        System.out.println(number);

    }
    public static void m2(){
        System.out.println(Test.name);
        Test num = new Test();
        System.out.println(num.number);
    }


}
