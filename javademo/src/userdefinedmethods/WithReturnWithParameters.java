package userdefinedmethods;

public class WithReturnWithParameters {
    public static void main(String[] args) {
      WithReturnWithParameters m = new WithReturnWithParameters();
        System.out.println(m.name("bhav"));
        System.out.println(m.sum(5,6));
        System.out.println(m.mix("bhav", 10));

    }


    public String name(String nam){
       return nam;
    }

    public int sum(int x, int y){
        int sumOfAAndB = x+y;
       // return  sumOfAAndB;
        return  y;
    }
    public String mix(String nam, int x){
        return nam;
    }

}
