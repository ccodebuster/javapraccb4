package conditionalstatements;

public class IfStatement {
     /*Syntax :- if(condition){
                   if body;
                     }  */


     public static void main(String[] args) {
          int m = 100, n = 200;

          String  name = "CODEBUSTER";
          String name1 = name.toLowerCase();

          if(name==name1 || name==name || n==m){  //Condition
              System.out.println("Is equal to");   //if body
          }



           if(m<n){     //Condition
               System.out.println("is less than");    //if body
               System.out.println("java");
           }

         System.out.println("Hello world");
     }
}
