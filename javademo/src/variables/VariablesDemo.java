package variables;

 public class VariablesDemo {
    //global
    /*
    Two ways of declaring variables 1. local 2. global
    * variables 2 types. instance and static
    * */
    String city = "london"; //global variables, outside method and inside class.   instance variable
    static int pinCode = 3456; // static variables.

    public static void main(String[] args) { // main method
        //local

        String name = "bhav"; // local variable
        System.out.println(name);
        VariablesDemo v2= new VariablesDemo();
        v2.bhavesh();// calling instance method in to main method
        code();
        System.out.println("end");
    }

    public void bhavesh() {// instance method and also user defined method

        String name1 = "codebuster2"; // local variable
        System.out.println(name1);
        System.out.println(city); // calling instance variables. direct access.
        System.out.println(VariablesDemo.pinCode);  //First way calling static variables through class name
        System.out.println(pinCode);  //Second way direct access

    }

    public static void code(){  //Declared static method also user defined method
        // test.Test t = new test.Test();
        VariablesDemo v1 = new VariablesDemo(); // Declaring object
        System.out.println(v1.city); // access instance variables through object.
        System.out.println(pinCode);// direct
        System.out.println(VariablesDemo.pinCode);// through class name
        System.out.println("Welcome Java");
        System.out.println("Hello World");
        System.out.println("Java is platform Independent and Portable language");
    }

}
