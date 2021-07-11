//Accessing the constructors of an class
import java.lang.reflect.Constructor;

class X{
    private final double pd = 5.5;

    public X(){
        System.out.println("Default Constructor");
    }

    public X(int x){
        System.out.println("Parameterized Constractor " + x);
    }
}

class App{
    public static void main(String[] args) throws Exception{
        X ob = new X(); //Default constructor called
        X ob1 = new X(10); //Parameterized constructor called
        Class c = ob.getClass();

        Constructor[] con = c.getDeclaredConstructors();
        for (int i = 0; i < con.length; i++) {
            System.out.println(con[i]);
        }
        System.out.println();
    }
}