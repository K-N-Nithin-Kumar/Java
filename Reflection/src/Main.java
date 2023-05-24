import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//reflection api helps on testing part, and it has import features
class Demo{
    //constructor
    public Demo()
    {
        System.out.println("Constructor of Demo class.");
    }
    //Static block
    static
    {
        System.out.println("Static block in the Demo class.");
    }
    //instance black
    {
        System.out.println("from instance block!"+"\nI am learning new things in java.");
    }
    public static void show()
    {
        System.out.println("from the public static method in the Demo class.");
    }
}

//using some reflection api techniques on class government
class Government
{

    private void repair(int cost)
    {
        System.out.println("Repairing:"+" $"+cost);
    }
}


public class Main {
    public static void main(String[] args) throws Exception
    {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        //class government stuff
        Class g = Class.forName("Government");
        Government gov = (Government) g.newInstance();
        Method m = g.getDeclaredMethod("repair", int.class);
        m.setAccessible(true);
        m.invoke(gov, 90);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        Demo d = new Demo();
        d.show();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        //reflection api part
        //loading the class Demo
        //Class.forName("Demo");

        //Using this method to learning more about the if you don't have
        //source code the Class, you go only the byte code which is ".Class" file

        Class obj = Class.forName("Product");

        //Get the Class name  of the Product.Class file using getName, getSuperclass...
        //getName()...
        System.out.println(obj.getSuperclass());
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        //Get all the constructors of the Product.Class file
        System.out.println(obj.getConstructors().length);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Constructor constructors[]= obj.getConstructors();
        for(Constructor constructor:constructors)
        {
            System.out.println(constructor);
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        //get field of the class
        Field fields[] = obj.getDeclaredFields();
        for(Field field:fields)
        {
            System.out.println(field);
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        Method methods[] = obj.getMethods();
        for(Method method: methods)
        {
            System.out.println(method);
        }

    }
}