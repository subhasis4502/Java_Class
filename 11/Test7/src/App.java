public class App {
    public static void main(String args[]) {
        int d = 0, res;
        try {
            res = 100 / d;
            throw new Exception(); // a catch block must be there to handle it
        }

        catch (Exception e) {
            System.out.println("catch block"); // if no catch block is there, then exception is not handled, but then also finally is executed
        }

        finally {
            System.out.println("Finally block");
        }

    }
}
