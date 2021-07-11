class Base{
    Base(){
        System.out.println("Base constructor called");
    }
}

class Child extends Base{
    Child(int val){
        System.out.println("Child constructor called");
    }
}

class App{
    public static void main(String[] args) {
        Child c1 = new Child(5);
    }
}
