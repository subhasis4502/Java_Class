public class App {
    public static void main(String[] args) throws Exception {
        int d = 0, res;
        try {
            res = 100 / d;
            throw new ArithmeticException();
        }

        catch (ArrayIndexOutOfBoundsException e) // not handled, catch block is not matched
        {
            System.out.println("catch block");
        }

        finally{ //will always be executed, program will be abruptly terminated
            System.out.println("Finally block");
        }
    }
}
