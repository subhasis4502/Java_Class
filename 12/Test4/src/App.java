//Way 3: Combining the way 1 and way 2
public class App {
    void g() throws ArithmeticException {
        try {
            f();
        } catch (ArithmeticException e) {
            System.out.println("caught and handled in g()");
            throw e;
        }
    }

    void f() throws ArithmeticException {
        throw new ArithmeticException("Test");
    }

    public static void main(String args[]) {
        App ob = new App();

        try {
            ob.g();
        }

        catch (Exception e) {
            System.out.println("Caught and handled in main ");
        }
    }

}
