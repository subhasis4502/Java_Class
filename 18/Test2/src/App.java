//Accessing and changing the value of private field and as well as final field in a class
import java.lang.reflect.Field;

class X{
    private double pd1 = 10.5;
    private final double pd2 = 4.5;
    public final double pd3 = 6.5;
}

public class App {
    public static void main(String[] args) throws Exception {
        X ob = new X();
        Class c = ob.getClass();
        
        Field f1 = c.getDeclaredField("pd1"); //Making an object of the class name and made a field of given name
        f1.setAccessible(true); //Enable the change of a private field of a class
        System.out.println("Before: " + f1.getDouble(ob)); //Accessing the value of that field
        f1.setDouble(ob, 5.5); //Changing the value of that field
        System.out.println("After: " + f1.getDouble(ob));

        Field f2 = c.getDeclaredField("pd2");
        f2.setAccessible(true); //This is working for Final as well
        System.out.println("Before: " + f2.getDouble(ob));
        f2.setDouble(ob, 5.5); 
        System.out.println("After: " + f2.getDouble(ob));

        //As 'pd3' is final that's why we need to use 'setAccessible' method
        Field f3 = c.getDeclaredField("pd3");
        f3.setAccessible(true);
        System.out.println("Before: " + f3.getDouble(ob));
        f3.setDouble(ob, 2);
        System.out.println("After: " + f3.getDouble(ob));

        //As we are not changing the value, we don't need to use the 'setAccessible' method
        Field f4 = c.getDeclaredField("pd3");
        System.out.println("Before: " + f4.getDouble(ob));

        //As we are using private data member, we must have to use the 'setAccessible' method
        Field f5 = c.getDeclaredField("pd2");
        f5.setAccessible(true);
        System.out.println("Before: " + f5.getDouble(ob));
    }
}
