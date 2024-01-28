package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo2<S> {
        public static void main(String[] args) {

        ArrayList<Integer> names = new ArrayList<>(); // declare arraylist
        names.add(2);
        names.add(46);
        names.add(34);
        names.add(78);
        names.add(56);
        names.add(12);

        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);

    }

}
