// File not found:
public class App {
    public static void main(String[] args) throws Exception {
        int d = 0, res;

        try {
            res = 100 / d; // ArithmeticException is thrown
        }

        catch (ArrayIndexOutOfBoundsException ob) // it is not matched
        {
            System.out.println("Exception caught" + ob);
            res = 100;
        }

        catch (Exception e) // transferred here; bcz it is superclass
        {
            System.out.println("Exception caught" + e);
        }

        System.out.println("After catch block");
    }
}
