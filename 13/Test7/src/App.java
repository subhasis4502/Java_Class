class DivideByZeroException extends Exception {
    int divisor;

    DivideByZeroException(int divisor) {
        this.divisor = divisor;
    }
}

class Divide {
    void div(int d) throws DivideByZeroException {
        try {
            double q = (double) 100 / d;
            throw new DivideByZeroException(1);
        }

        finally {
            System.out.println("Finally block"); // op
        }
    }
}

public class App {
    public static void main(String args[]) {
        Divide ob = new Divide();

        try {
            ob.div(0);
        } catch (DivideByZeroException e) {
            System.out.println("Exception handled at the end"); // op
        }
    }

}