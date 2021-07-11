// Using 'this' operator to pass the reference.
public class App {
    int a,b;
    App(){
        a=10;
        b=20;
    }

    void display(App ob){
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }

    void get(){
        display(this);
    }

    public static void main(String[] args) {
        App a1 = new App();
        a1.get(); 
    }
}
