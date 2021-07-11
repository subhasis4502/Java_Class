// Generic Functions: A generic function can be called with different types of arguments passed to the generic method.
public class App{
    static<T> void display(T obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        display(5);
        display(6.9);
        display("Hello");
    }
}
