package collection;

import java.util.HashMap;

/* Hasmap doesnt maintin order of insertion
   //It allows only unique value

   //-Example----
   //Name(Key): bhavesh(Value)
   //Surnae(Key): patel(value)*/
public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "bhav");
        students.put(2, "pat");
        students.put(3, "david");

        System.out.println(students);
        students.replace(2, "patel");
        System.out.println(students);


        for (String a: students.values()){
            if(a.equalsIgnoreCase("david")){
                System.out.println(a);
            }

        }

        for (Integer a: students.keySet()){
            System.out.println(a);
        }

        for (Object a: students.entrySet()){
            System.out.println(a);
        }

        students.replace(2, "patel");

    }
}
