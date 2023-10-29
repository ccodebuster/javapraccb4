package conditionalstatements;
 /*     if(condition){
                  if body;
           }else if (condition){
                 else if body;
           }else{
                 else body;
          }     */

public class Nested_If_Else {

    public static void main(String[] args) {
        int marks = 75;
        if(marks>=90){
            System.out.println("Grade A");
        } else if (marks<=80) {
            System.out.println("Grade B");
        } else if (marks<=70) {
            System.out.println("Grade C");
        }
        else if (marks<=50){
            System.out.println("Grade D");
        }
        else {
            System.out.println("Fail");
        }
    }

}
