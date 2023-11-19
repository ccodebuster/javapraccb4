package encapsulation;

public class Test_Encapsulation extends Encapsulation_Demo {

    public static void main(String[] args) {
        Test_Encapsulation t = new Test_Encapsulation();

        t.setEmp_Id(1001);
        t.setEmp_Name("Bhavesh");
        t.setSalary(45000);

        System.out.println(t.getEmp_Id());
        System.out.println(t.getEmp_Name());
        System.out.println(t.getSalary());
        System.out.println("******************************");

        t.setEmp_Id(1002);
        t.setEmp_Name("Gaurang");
        t.setSalary(55000);

        System.out.println(t.getEmp_Id());
        System.out.println(t.getEmp_Name());
        System.out.println(t.getSalary());
        System.out.println("******************************");

        t.setEmp_Id(1003);
        t.setEmp_Name("Krishiv");
        t.setSalary(65000);

        System.out.println(t.getEmp_Id());
        System.out.println(t.getEmp_Name());
        System.out.println(t.getSalary());
        System.out.println("******************************");


        t.setName_Code("Vaidehi patel");
        System.out.println(t.getName_Code());
    }
}
