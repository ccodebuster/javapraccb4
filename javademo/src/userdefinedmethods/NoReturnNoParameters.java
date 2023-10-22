package userdefinedmethods;

public class NoReturnNoParameters {

   static int x=5;
    static int y=6;
   static String name ="code";

    public static void main(String[] args) {
      NoReturnNoParameters m = new NoReturnNoParameters();
      m.sum();
      m.sum();
      m.sum();

    }

    public void sum(){
        System.out.println(x+y);
        System.out.println(name);
    }


}
