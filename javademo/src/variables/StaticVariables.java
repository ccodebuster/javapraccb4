package variables;


/*Static Variables:- Variables which are declared inside the class,outside the
method with static keyword is called Static Variable.
 Scope:- across the class or within the class
*/
public class StaticVariables {

   static String name2 ="buster"; // static variables
    public static void main(String[] args) {
        // static area
        System.out.println(name2); // static to static direct access
        System.out.println(StaticVariables.name2); // or through class name

    }

    // instance method
    public void  demo(){
        // Local area
        //instance area
        System.out.println(name2); //access direct
    }

    public static <name3> void  demo1(){
        // Local area
        //static area
        System.out.println(name2);
        System.out.println(StaticVariables.name2);

    }
}
