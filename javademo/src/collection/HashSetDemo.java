package collection;

import java.util.HashSet;

public class HashSetDemo {
    /*
     *1.  Sets are unordered list(not store value in order)
     * 2. Sets only allow unique vale.If you enter duplicate it will override with the first value.
     * 3. You can't use get method because values are not stored in order.
     * It allows stored null Values
     */

    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("bhav");
        names.add("code");
        names.add("buster");
        names.add("bhav");
        names.add("code");
        names.add("buster");
        System.out.println(names);

        System.out.println(names.contains("bhav"));
        System.out.println(names.contains("bhavesh"));
        System.out.println(names.remove("bhav"));

    }
}
