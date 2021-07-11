class Base{
    int value = 10;
    Base(){
        System.out.println("Base constructor");
    }
}

class Child extends Base{
    int value = 20;
    Child(){
        System.out.println("Child constructor");
    }
}

class App{
    public static void main(String[] args) {
        Base b = new Base();
        System.out.println(b.value);
        System.out.println();
        Child c = new Child();
        System.out.println(c.value);
    }
}