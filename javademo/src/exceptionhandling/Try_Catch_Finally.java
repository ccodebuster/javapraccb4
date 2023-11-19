package exceptionhandling;

public class Try_Catch_Finally {
    //Three types of excepetion
    //1. checked  --------- compile time
    //2. unchecked  ------------- runtime
    //3. error  ---- developer mistake

    //2 ways to handle expection
    // 1. try and catch block
    //2. throws

    /*Syntax:
    try{
            Code to run
        }catch (Exception name reference variable){
            Code to run if an exception is raised
            }

     */

    public static void main(String[] args) {


        try {   //It contains risky code
            System.out.println("abcd");
            System.out.println(10/0);
        } catch (Exception e) {  //It is used to handle the exception
            System.out.println("Vaidehi");
            System.out.println(10/0);
        }
        finally{ //always executed and used for safest code
            System.out.println("Codebuster Testing");
            System.out.println("Java");
    }
    }
}
