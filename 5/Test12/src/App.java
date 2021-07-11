class Base {
    int x = 10;

    Base() {
        System.out.println("Base constructor");
    }

    void show() {
        System.out.println("Base Show method");
    }
}

class Child extends Base {
    int x = 20;

    Child() {
        System.out.println("Child constructor");
    }

    void show() {
        System.out.println("Child Show method");
    }
}

class App {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.x);
        c.show();
        System.out.println();
        Base b = new Child(); // Creating a Base referene of child class
        System.out.println(b.x);
        b.show();
    }
}