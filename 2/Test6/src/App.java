//Overloading main function
public class App {
    public static void main(String[] args) {
        System.out.println("Hello");
        App.main("Hello");
    }

    public static void main(String args1) {
        System.out.println("args1: " + args1);
        App.main("Hello", " World");
    }

    public static void main(String args1, String args2) {
        System.out.println("args2: " + args1+args2);
    }
}
