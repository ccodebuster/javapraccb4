public class StringMethods {


    public static void main(String[] args) {

        String name = "codebuster";
        System.out.println(name);

        String codeBusterNameToUpperCase=name.toUpperCase(); // change it to uppercase
        System.out.println(codeBusterNameToUpperCase);

       int lengthOfWord = name.length(); // return length of word
        System.out.println(lengthOfWord);

       int indexOfB=name.indexOf("b");
        System.out.println(indexOfB);

        System.out.println(name.trim());

        System.out.println(name.substring(3));

    }
}
