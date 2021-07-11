import java.lang.reflect.Field;

class X{
    public double pd1 = 1.0;
    public double pd2 = 2;
}

public class App {
    public static void main(String[] args) throws Exception {
        X ob = new X ();
        Class c = ob.getClass();
        String fName = "App";
        Field f = c.getDeclaredField(fName);
        System.out.println("Before: " + fName + " " + f.getDouble(ob));
        f.setDouble(ob, 5);
        System.out.println("After: " + fName + " " + f.getDouble(ob));
    }
}
