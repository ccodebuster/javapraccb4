package exceptionhandling;

public class Throws_Test {

    public void khusbu() throws Exception {
        System.out.println(10/0);
    }

    public void sonal() throws Exception{
       khusbu();
    }

    public void sumit() throws Exception{
      sonal();
        }


    public void vaidehi()  {
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
