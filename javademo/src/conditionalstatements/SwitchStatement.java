package conditionalstatements;
 /* switch(expression){
                    case lable1:
                         sout();
                         break;
                    case lable2:
                         sout();
                          break;
                    case lable n:
                        sout();
                         break;
                         default:
                         sout();
                         }
   */

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        //String city = "D";
        //int city = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character between A to C : " );
        String city = sc.next();

        switch (city){
           // case 1:
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Baroda");
                break;
            case "C":
                System.out.println("Chandigadh");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
