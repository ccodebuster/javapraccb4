package polymorphism.methodoverloading;
  /*The class contains more than one method with the same name but different
    number of argument or same number of arguments with different data type. These
    called overloaded method*/

/*Rules:-a. Same method name with different number of arguments.
        b. Same method name with same number of arguments with different data type.
        c. Same method name with same number of arguments with different sequence
        of data type of arguments.   */



public class MethodOverloading {

    public void addition(int a, int b){
        System.out.println("This method contains integer datatype with variable a and b");
        System.out.println(a+b);

    }

    public void addition(int a){
        System.out.println("This method contains integer datatype with variable a");
        System.out.println(a);
    }

    public void addition(int a, String name){
        System.out.println("This method contains integer and string datatype with variable a and name");
        System.out.println(a);
        System.out.println(name);
    }

    public void addition(String name, String text){
        System.out.println("This method contains string datatype with variable name and text");
        System.out.println(name);
        System.out.println(text);
    }

    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        m.addition("Codebuster","Testing");
        m.addition(20);
        m.addition(20,40);
        m.addition(20,"Java");
    }

}
