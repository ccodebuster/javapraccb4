package encapsulation;

/* Encapsulation is a mechanism through which
     we can wrapping the data and methods of class in single unit.

     Rule to Declare:-
•	 Declared the Variables as a Private
•	Declare the method as a public  */

/* Difference between Abstraction and Encpsulation:-
    •	Abstraction means giving only essential things and hiding unnecessary details.
        Encapsulation is the binding of data members and methods together in capsule to
        avoid unnecessary changes to data from external users.
    •	Abstraction is a design level process and it is used to reduce the complexity
        at the designing stage of the project.
        Encapsulation is an implementation level process, and it is used to provide privacy and maintain control over the transparency
        of data at the implementation stage of a project.
.
        Note : - Encapsulation is a combination of data hiding and Abstraction. */


public class Encapsulation_Demo {

    private  int emp_Id;
    private  String emp_Name ;
    private int salary;
    private String name_Code;

    public int getEmp_Id() {   //getter method and This method used to get Value
        return emp_Id;
    }
    public void setEmp_Id(int emp_Id) {  //setter method. This method set the Value.
        this.emp_Id = emp_Id;
    }

    public String getEmp_Name() {  //getter method and This method used to get Value
        return emp_Name;
    }

    public void setEmp_Name(String emp_Name) {  //setter method. This method set the Value.
        this.emp_Name = emp_Name;
    }

    public int getSalary() { //getter method and This method used to get Value
        return salary;
    }

    public void setSalary(int salary) {  //setter method. This method set the Value.
        this.salary = salary;
    }

    public String getName_Code() {
        return name_Code;
    }

    public void setName_Code(String name_Code) {
        this.name_Code = name_Code;
    }
}
