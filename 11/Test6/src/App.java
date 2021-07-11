/* Finally: This block must be executed no matter exception arises or not
try
{
//code with multiple exit points
}
//zero or more catch blocks
finally
{
//executed
} 
*/

class App {
    public static void main(String args[]) {
        int d = 0, res;
        try {
            res = 100 / d;

        }

        catch (ArithmeticException e) {
            System.out.println("Exception caught"); // op

        }

        finally {
            System.out.println("Finally block"); // op
        }

    }

}