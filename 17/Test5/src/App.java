import java.lang.reflect.Constructor;

class Simple {
    private String s;
    public Simple(){
        s = "JU IT";
    }

    void method1(){
        System.out.println("Method 1");
    }

    void method2(){
        System.out.println("Method 2");
    }

    void method3(){
        System.out.println("Method 3");
    }
}

class App { 
    public static void main(String[] args) throws Exception{
        Simple s = new Simple();
        Class c = s.getClass();
        System.out.println(c.getName());
        Constructor con = c.getConstructor();
        System.out.println(con.getName());
    }
}