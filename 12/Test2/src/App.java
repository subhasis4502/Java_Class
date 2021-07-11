//Way: 1 -
//This declaration/way is useful if g() knows what exactly it should do if f() throws an exception
public class App {
    void g() {
        try {
            f(); 
        } 
        
        catch (Exception e) {
            System.out.println("Exception caught");
        }

        /* catch (ArithmeticException e) { //Error; f() is declared to throw superclass 'Exception' object
            System.out.println("Exception caught");
        } */
        
    }

    void f() throws Exception{ 
        throw new ArithmeticException("Test");
    }

    public static void main(String[] args) {
        App ob  = new App();
        ob.g(); 
    }
}