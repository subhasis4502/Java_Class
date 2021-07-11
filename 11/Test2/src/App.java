public class App {
    public static void main(String[] args) {
        int d = 0, res;
        int a[] = new int[5];
        try{
            res = 100/d; // Only this exception will show
            a[5] = 10;
        }

        catch(ArithmeticException e){
            System.out.println("Exception for division with zero: " + e);
            res = 100;
        }

        catch(ArrayIndexOutOfBoundsException ar){
            System.out.println("Exception for array outbound: " + ar);
        }
        System.out.println("After catch block");
    }
}
