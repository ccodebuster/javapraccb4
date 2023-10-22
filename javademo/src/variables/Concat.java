package variables;

public class Concat {

    public static void main(String[] args) {
        String name = "Prishiv";
        String name1 = "Patel";

        int a = 100, b=200, c= a+b;  //Declared int datatype as int and variables as a, b and c

        //Print starements
        System.out.println(name + name1); //Using concatination to join two Strings


        System.out.println(a);
        System.out.println("addition of " +a+ " and " +b+ " : "+c);
        System.out.println("addition of " +a+ " and " +b+ " : "+a+b);
        System.out.println("Subtraction of " +a+ " and " +b+ " : "+(b-a));
        System.out.println("Addition of a and b : " +c);

    }
}
