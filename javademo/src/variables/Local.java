package variables;
public class Local {
    //global area
    String name2 ="buster"; // global variables
    public static void main(String[] args) {
        // Local area
        // static area

        String name="code"; // Local variables
        System.out.println(name);

    }

    // instance method
    public void  demo(){
        // Local area
        //instance area

        int x=5;
        System.out.println(x);

    }

    public static void  demo1(){
        // Local area
        //instance area

        int x=5;
        System.out.println(x);

    }


}
