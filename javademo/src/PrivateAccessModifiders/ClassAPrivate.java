package PrivateAccessModifiders;

public class ClassAPrivate {
 private String accountNumber = "4675754abc"; // only visible to class
 private int sortCode = 467575;

    public static void main(String[] args) {
        ClassAPrivate a = new ClassAPrivate();
        System.out.println(a.accountNumber);
        System.out.println(a.sortCode);


    }

}
