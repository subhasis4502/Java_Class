// Using 'this' operator for initializing values.
public class App {
    int a, b;
    App(){
        this(10,20);
        System.out.println("With default constructor.");
    }

    App(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("With parameterized constructor.");
    }

    void display(){
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }

    public static void main(String[] args) {
        App a1 = new App();
        a1.display();

        App a2 = new App(5,15);
        a2.display();
    }
}
