package variables;

/*Instance Variable:- variables which are declared inside the class
but outside the methods are called Instance Variable.
Scope:- across the class but into instance area.
*/
public class InstanceVariables {

    //global area
    String name2 ="buster"; // instance variables

    public static void main(String[] args) {
        // static area
        String name="code"; // instance variables
        System.out.println(name);
        InstanceVariables obj = new InstanceVariables();// create object to access instance variables
        System.out.println(obj.name2);

    }

    // instance method
    public void  demo(){
        // Local area
        //instance area

        int x=5; // instance variables
        System.out.println(x);
        System.out.println(name2);

    }

    public static void  demo1(){
        // Local area
        //static area

        int y=5;  // instance variables
        System.out.println(y);
        InstanceVariables a = new InstanceVariables();
        System.out.println(a.name2);

    }


}
