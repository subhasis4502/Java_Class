// Using 'this' operator to return the reference.
public class App {
    int a, b;
    App(){
        a=10;
        b=20;
    }

    App get(){
        return this;
    }

    void display(){
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }

    public static void main(String[] args) {
        App a1 = new App();
        a1.get().display(); //Cascaded calling
    }
}
