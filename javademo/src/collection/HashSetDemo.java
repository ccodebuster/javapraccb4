package collection;

import java.util.HashSet;

public class HashSetDemo {

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
