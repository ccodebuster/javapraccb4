package construtor;

import test.Test;

public class TestConstructor {

    String firstName;
    int realAge;
    String council;
    String city;

    public static void main(String[] args) {
        TestConstructor testConstructor= new TestConstructor("hillingdon","london", "ayan");
        testConstructor.displayAyanName();

    }

    TestConstructor(String council, String  city, String name){
        this.council = council;  // firstname = "bhavesh"
        this.city = city;
        this.firstName = name;
    }


    public void displayAyanName(){
        System.out.println(firstName);
        System.out.println(city);
    }


}
