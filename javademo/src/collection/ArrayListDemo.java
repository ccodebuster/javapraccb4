package collection;

import java.util.ArrayList;

public class ArrayListDemo<S> {



    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(); // declare arraylist
        names.add("bhav");
        names.add("code");
        names.add("buster");

       for(String a : names){
           if(a.equalsIgnoreCase("code")){
               System.out.println(a);
           }

       }


//        System.out.println("print full arrayList: " + names);  // print everything from list
//        System.out.println("print at index 1: " + names.get(1)); // print from index number---printing code
//        names.set(1, "code1");   // setting value with index
//        System.out.println("print at index 1: " + names.get(1)); // printing code1
//        System.out.println("print full arrayList: " + names);
//        names.remove(1);  // remove code1
//        System.out.println("print full arrayList: " + names);  // print everything from list
//        System.out.println("print at index 1: " + names.get(1)); //buster
//        names.set(1, "code1");   // setting value with index
//        System.out.println("print full arrayList: " + names);
//        System.out.println("Not Present in arrayList: " + names.remove("buster")); //false
//        System.out.println("Present in arrayList: " + names.remove("bhav")); //true
//
//        names.clear();
//        System.out.println("print empty arrayList: " + names);


    }


}
