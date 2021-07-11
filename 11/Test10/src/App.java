//If an exception is rethrown, then also finally block is executed:

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

        finally {
            System.out.println("Finally");
        }
    }
}

/* Properties of finally:
1. Every try block may have at most 1 finally block..[finally block may be there (only 1), may not be there]
2. A finally block may exist without any catch block.
3. A finally block, is used, must be placed after all the catch blocks.
4. Suppose, a return statement is encountered before the try block completes. But before it returns to the caller, the finally block is still executed.
*/