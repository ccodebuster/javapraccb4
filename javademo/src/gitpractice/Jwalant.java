package gitpractice;

public class Jwalant {
    String name;private int myNumber;
    private String myString;
    public static void main(String[] args) {
        System.out.println("This is Jwalant's git branch class");
        Jwalant jwalant = new Jwalant(2, "Jack");
        System.out.println(jwalant);


        }

    // Constructor
    public Jwalant(int number, String text) {
        // Initialize the fields with the values passed to the constructor
        myNumber = number;
        myString = text;
    }
}
