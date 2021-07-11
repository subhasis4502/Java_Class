class Base{
    int x;
    Base(int val){
        x = val;
        System.out.println("Base constructor called");
    }
}

class Child extends Base{
    Child(int val){
        super(val); //Super is used to call the constructor or the member methods from the parent class
        System.out.println("Child constructor called");
    }
}

class App{
    public static void main(String[] args) {
        Child c1 = new Child(5);
    }
}