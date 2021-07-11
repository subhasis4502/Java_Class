// One class implements multiple interfaces
interface In1{
    void fun1();
}

interface In2{
    void fun2();
}

class Diamond implements In1, In2{
    public void fun1(){
        System.out.println("Fun 1");
    }
    public void fun2(){
        System.out.println("Fun 2");
    }
}

class App{
    public static void main(String[] args) {
        Diamond d = new Diamond();
        d.fun1();
        d.fun2();
    }
}
