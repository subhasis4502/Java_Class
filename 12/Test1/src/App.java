//Use of Throws  
public class App {
    void g() {
        try {
            f(); //calling point of f(), must be embedded within try-catch block
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }

    void f() throws Exception{ // f() is declared to throw an Exception
        throw new Exception("Test");
    }

    /* void f() throws ArithmeticException{
        throw new Exception("Test"); // Gives error
    } */

    /* void f() throws Exception{
        throw new ArithmeticException("Test"); // Possible, because ArithmeticException is a sub-class of Exception
    } */

    public static void main(String[] args) {
        App ob  = new App();
        ob.g(); 
    }
}
