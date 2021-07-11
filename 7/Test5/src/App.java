//Multilevel Inheritence
/* interface IN{
    void f1(); //Default is only used if we mention the body
    void f2();
    void f3();
}

abstract class AB implements IN{
    public void f3(){
        System.out.println("Within f3: AB");
    }
}

class ABC extends AB{
    public void f1(){
        System.out.println("Within f1: ABC");
    }

    public void f2(){
        System.out.println("Within f2: ABC");
    }
}

class App {
    public static void main(String[] args) {
        IN i = new ABC();
        i.f1();
        i.f2();
        i.f3();
    }
} */

interface IN{
    void f1(); //Default is only used if we mention the body
    void f2();
    void f3();
}

abstract class AB implements IN{
    public void f3(){
        System.out.println("Within f3: AB");
    }
}

class ABC extends AB{
    public void f1(){
        System.out.println("Within f1: ABC");
    }

    public void f2(){
        System.out.println("Within f2: ABC");
    }

    public void f3(){
        System.out.println("Within f3: ABC");
    }
}

class App {
    public static void main(String[] args) {
        IN i = new ABC();
        i.f1();
        i.f2();
        i.f3(); //RTP
    }
}