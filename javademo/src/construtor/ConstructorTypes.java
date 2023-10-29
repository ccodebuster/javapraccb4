package construtor;

public class ConstructorTypes {

    String firstName;
    public ConstructorTypes(){
        System.out.println("zero argument");
    }
    public ConstructorTypes(String name){
        System.out.println("one argument");
        System.out.println(name);
        this.firstName= name;
    }
    public ConstructorTypes(int age){
        System.out.println("one argument");
        System.out.println(age);
    }
    public ConstructorTypes(String name, int age){
        System.out.println("two argument");
        System.out.println(name);
        System.out.println(age);
    }

    public ConstructorTypes(String name, int age, String city){
        System.out.println("three argument");
        System.out.println(name);
        System.out.println(age);
        System.out.println(city);
    }

    public static void main(String[] args) {
       //ConstructorTypes c = new ConstructorTypes();
      // ConstructorTypes c1 = new ConstructorTypes("code");
       //ConstructorTypes c3 = new ConstructorTypes(23);
       ConstructorTypes c4 = new ConstructorTypes("bhavesh",23);
       ConstructorTypes c6 = new ConstructorTypes("codebuster",23);
      // ConstructorTypes c5 = new ConstructorTypes("codebuster",23, "london");



    }



}
