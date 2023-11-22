package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*
* Java LinkedList class can contain duplicate elements.
Java LinkedList class maintains insertion order.
Java LinkedList class is non synchronized.
In Java LinkedList class, manipulation is fast because no shifting needs to occur.
Java LinkedList class can be used as a list, stack or queue.*/

public class LinkedListDemo<S> {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>(); //Declared Linked list
        names.add("bhav");
        names.add("code");
        names.add("buster");

        LinkedList<String> names2 = new LinkedList<>();
        names2.add("bhav");
        names2.add("code");
        names2.add("buster");

        System.out.println("before adding names collection: "+names2);
        names2.addAll(names);
        System.out.println("after adding names collection: "+names2);

        System.out.println(names);

        for(String a : names){
            if(a.equalsIgnoreCase("code") || a.equalsIgnoreCase("bhav") ){
                System.out.println(a);
            }
        }

        Iterator<String> its = names.iterator();
        System.out.println(its.next());
        }


}
