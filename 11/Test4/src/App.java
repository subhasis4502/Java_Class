public class App {
    public static void main(String args[]) {
        int d = 0, res;
        int a[] = new int[5];

        try {
            a[5] = 6;
            res = 100 / d;
        }

        catch (Exception e) // superclass of exception hierarchy, then the rest of catch blocks are unreachable
        {
            System.out.println("Exception caught" + e);
        }
        /*
        catch(ArrayIndexOutOfBoundsException ob) //unreachable code, error is
        reported { System.out.println("Exception caught"+ob); res=100;
        }
        */
        System.out.println("After catch block");
    }

}