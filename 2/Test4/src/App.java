// Using 'this' operator to call some other methods for that instance
public class App {
    void display(){
        this.show();
        System.out.println("Inside display function.");
    }

    void show(){
        System.out.println("Inside show function.");
    }

    public static void main(String[] args) {
        App a1 = new App();
        a1.display();
    }
}
