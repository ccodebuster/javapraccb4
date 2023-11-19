package exceptionhandling;

public class Test_Throw {

    public static void validate(int age) throws Exception {
        if(age<18){
            throw new Exception("Person not eligible for vote");
        } else {
            System.out.println("eligible for vote");
        }
    }
    public static void main(String[] args) throws Exception {
        validate(15);
    }
}
