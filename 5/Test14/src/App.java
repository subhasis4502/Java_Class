class Base{
    private int fun(int i){
        System.out.println("Base fun");
        return (i+3);
    }
}

class Child extends Base{
    public double fun(double i){
        System.out.println("Child fun");
        return (i+3.5);
    }
}

class App{
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.fun(5));
        System.out.println(c.fun(5.5));
    }
}