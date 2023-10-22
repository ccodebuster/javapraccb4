package accessmodifiers;

public class ClassBPublic { //Declared class name as ClassBPublic

    public static void main(String[] args) {
      /*
      Here, ClassCDefault is a class name, c is an object name, new is a keyword
      and ClassCDefault() is a Constructor.
       */

        ClassCDefault c = new ClassCDefault(); //Create an object
        System.out.println(c.name); //calling varible using object
        System.out.println(c.sur); //calling varible using object

         /*
      Here, ClassAPublic is a class name, b is an object name, new is a keyword
      and ClassAPublic() is a Constructor.
       */

        ClassAPublic b = new ClassAPublic();  //Create an object
        System.out.println(b.name); //calling varible using object
        System.out.println(b.name1); //calling varible using object
    }

}
