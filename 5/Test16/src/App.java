class Base{
    final void show(){ // Final helps to stop overriding a method
        System.out.println("Base show");
    }
}

class Child extends Base{
    /* void show(){ //Cannot override
        System.out.println("Child show");
    } */
}

class App{
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
