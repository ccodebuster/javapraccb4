package gitpractice;

public class Pankti {
    String name;
    public static void main(String[]args){
        Pankti pankti= new Pankti("Nanavati");
        System.out.println("Working on branch");
        System.out.println("Created a new branch");
        System.out.println(pankti);
    }

    public Pankti (String name) {
        this.name=name;

    }

}
