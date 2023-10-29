package accessmodifiers;

public class ClassCDefault {
   public String name = "bhav";  //Declared Instance method
   String sur = "pat"; //Declared Instance method

    public static void main(String[] args) {  //Main method
        ClassCDefault c = new ClassCDefault();  //Create an object

        //Print Statemets
        System.out.println(c.name);  //calling variable using object
        System.out.println(c.sur);  //calling variable using object
    }

}
