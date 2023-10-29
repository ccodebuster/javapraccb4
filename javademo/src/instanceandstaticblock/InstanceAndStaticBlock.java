package instanceandstaticblock;

/* Class have 5 elements.              -------Multiline comments
    1. Variables
    2. Methods
    3. Constructors
    4. Instance blocks
    5. Static blocks */

public class InstanceAndStaticBlock {


    public static void main(String[] args) {  //Main method
        //Declared Variables
        int a = 10, b=20, c = a+b;
        String name  = "Java";
        InstanceAndStaticBlock i = new InstanceAndStaticBlock();  //Create an object
        i.instancemethod();  //calling instance method using object
        staticmethod();  //calling static method directly
        InstanceAndStaticBlock.staticmethod();  //calling static method using class name
    }

    public InstanceAndStaticBlock(){    //Declared Constructor
        System.out.println("Constructor");
    }

    {                                    //Declared Instance block
        System.out.println("Instance block");
    }

    {                                    //Declared Instance block
        System.out.println("Instance block 1");
    }

    static {                                 //Declared static block
        System.out.println("Static block 1");
    }

    static {                                 //Declared static block
        System.out.println("Static block");
    }

    public void instancemethod(){   //Declared instance method
        System.out.println("Instance method");
    }

    public static void staticmethod(){   //Declared static method
        System.out.println("Static method");
    }
}
