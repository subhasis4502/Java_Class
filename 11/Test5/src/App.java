// Exception Rethrowing:
public class App {
    public static void main(String args[]) {
        int d = 0, res;

        try {
            try {
                res = 100 / d;
                throw new Exception("test");
            }

            catch (ArithmeticException e) {
                System.out.println("Exception caught");

                throw e; // rethrowing an exception
            }
        }

        catch (Exception e) // vatch the rethrown exception object
        {
            System.out.println("Exception rethrown");
        }

        System.out.println("After catch block");
    }

}