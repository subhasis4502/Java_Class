//Accessing and changing the value of public fields in a class
import java.lang.reflect.Field;

class X{
    public double pd1 = 10.5;
    public double pd2 = 4.5;
}

public class App {
    public static void main(String[] args) throws Exception {
        X ob = new X();
        Class c = ob.getClass();
        
        Field f = c.getDeclaredField("pd1"); //Making an object of the class name and made a field of given name
        System.out.println("Before: " + f.getDouble(ob)); //Accessing the value of that field
        f.setDouble(ob, 5.5); //Changing the value of that field
        System.out.println("After: " + f.getDouble(ob));
    }
}
