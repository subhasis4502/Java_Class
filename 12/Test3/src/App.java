
/* Way 2:
If g() does not have any idea on how to handle the exception thrown by f(), then g() must be declared to throw an Exception type object... 
Since main() is the calling point of g(), the function call statement must be embedded within a try block.
*/
public class App {
    void g() throws Exception{
        f();
    }

    /* void g() throws ArithmeticException{ //Error; the caller of f() cannot be declared to throw a subclass of the Exception type- thrown by f()
        f();
    } */

    void f() throws Exception{
        throw new ArithmeticException("Test");
    }

    public static void main(String[] args) {
        App ob = new App();
        try {
            ob.g(); //g() is declared to throw an Exception object; catch block must catch Exception object 
        } catch (Exception e) {
            System.out.println("Caught and handled in main");
        }
    }
}
