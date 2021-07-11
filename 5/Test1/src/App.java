//Inheritence
class Base{
    Base(){
        System.out.println("Base constructor created");
    }
}

class Child extends Base{
    Child(){
        System.out.println("Child constructor called");
    }
}

class App{
    public static void main(String[] args) {
        Child c1 = new Child();
    }
}