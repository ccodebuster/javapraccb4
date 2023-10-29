package arrayexample;
/*Arrays are used to store multiple values in a single variable,
 instead of declaring separate variables for each value.
* To declare an array, define the variable type with square brackets:

 */
public class ArrayDemo {

    public static void main(String[] args) {
        int a = 10, b= 20 , c= 30;
        String name = "Vaidehi";
        String name1 = "Bhavesh";

        //Two ways to declared Arrays
        int [] x;  //Preffered way
        int y [];

         //Declaring Arrays

        //Single Dimensional Arrays
        int [] numbers ={10,20,30,40,50,60};
        String [] text = {"Sonal", "Sumit","Khushbu","Shikha"};


        System.out.println(numbers[1]); // Calling data from its index number
        System.out.println(text[1]); // Calling data from its index number
        System.out.println(numbers.length); // it will give the length of the array
        System.out.println(text.length); // it will give the length of the array

        //Multiple Dimensional Arrays
        int [][] table = {{100,101,102,104}, //Row and Column
                          {200,201,202,204},
                          {300,301,302}};


        System.out.println(table.length); // it will give the length of the array
        System.out.println(table[0][1]); // Calling data from its index number
        System.out.println(table[2][1]); // Calling data from its index number



    }
}
