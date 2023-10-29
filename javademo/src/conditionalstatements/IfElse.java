package conditionalstatements;
 /*  if(condition){
           if body; (true body)
           }else {
            else body; (false body)
             }        */

public class IfElse {
    public static void main(String[] args) {
        int a = 100, b = 200;

        if (a == b) {   //Condition
            System.out.println("Is Equal to");     //true body
        }

        else {
            System.out.println("Is not Equal to");  //false body
        }

        System.out.println("Java");
    }
}
