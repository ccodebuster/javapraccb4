package abstraction;

public class Child_Abstract_Class extends Parent_Abstract_Class {


    @Override
  public void balanceCheck() {
        System.out.println("Balance check Functionality");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Withdraw Money Functionality");
    }

    public void printName(){
        System.out.println("Software Testing");
    }


    public static void main(String[] args) { //Main method
        Child_Abstract_Class c = new Child_Abstract_Class(); //Create Object of Child class to access Parent class methods
        c.m1();  //called Parent class method using Child class object
        c.balanceCheck();
        c.printName();
        c.withdrawMoney();
    }
}
