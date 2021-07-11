//Invoking private/public member methods
import java.lang.reflect.Method;

class X{
    private final double pd = 5.5;

    private void fun1(){
        System.out.println("Fun 1 " + pd);
    }

    public void fun2(){
        System.out.println("Fun 2 " + pd);
    }

    public void fun3(int a){
        System.out.println("Fun 3 " + a + " " + pd);
    }
}

class App{
    public static void main(String[] args) throws Exception{
        X ob = new X();
        Class c = ob.getClass();

        //Give only the declared methods
        Method[] m = c.getDeclaredMethods();
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }
        System.out.println();

        //Give all the present methods
        Method[] ma = c.getMethods();
        for (int i = 0; i < ma.length; i++) {
            System.out.println(ma[i]);
        }
        System.out.println();


        Method m1 = c.getDeclaredMethod("fun1");
        m1.setAccessible(true); //To access private method
        m1.invoke(ob);

        Method m2 = c.getDeclaredMethod("fun2");
        m2.invoke(ob);

        Method m3 = c.getDeclaredMethod("fun3", int.class); //'int.class' is used to pass the data '200'
        m3.invoke(ob, 200);

    }
}
