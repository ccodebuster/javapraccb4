package gitpractice;

public class Nayan {

    String name;
    public static void main(String[] args) {

        Nayan nayan = new Nayan("Nayan Patel-Week14");//calling constractore
        System.out.println("Java code is updated");
        System.out.println("not code is updated");
        System.out.println(nayan);
    }
//Creating Costractor
    Nayan(String name) {
        this.name=name;
    }
}
