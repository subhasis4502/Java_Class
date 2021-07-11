public class App {
    // A throws clause may include more than 1 Exception types separated by comma...

    void g() throws ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException {
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

        catch (ArithmeticException e) {
            System.out.println("Caught and handled in main ");
        }
    }

}
