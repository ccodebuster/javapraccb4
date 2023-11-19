package exceptionhandling;

public class Throws_Test {

//    throws is used with the method signature.

    /*
    We can declare multiple exceptions
    using throws keyword that can be thrown by the method.
     */

    public void khusbu() throws Exception { //not handeled and throws exception
        System.out.println(10/0);
    }

    public void sonal() throws Exception{ //not handeled and throws exception
       khusbu();
    }

    public void sumit() throws Exception{ //not handeled and throws exception
      sonal();
        }


    public void vaidehi()  { //accept the exeption and handeled code
        try {
            khusbu();
        } catch (Exception e) {
            System.out.println(10 / 2);
        }
    }

    public static void main(String[] args) {
        Throws_Test t = new Throws_Test();
        t.vaidehi();
    }



}
