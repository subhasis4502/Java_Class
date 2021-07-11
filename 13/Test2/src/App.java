public class App {

    void fun() {
        try {
            System.out.println("Outer try"); // op 1
            int r = 100 / 0;

        }

        catch (Exception e) {
            try {
                int r1 = 100 / 0;
                System.out.println("Inner try");
            } catch (Exception e1) {
                System.out.println("Inner catch"); // op 2

            }
            System.out.println("Outer catch"); // op 3
        } // outer catch is closed

    }

    public static void main(String args[]) {
        App ob = new App();
        ob.fun();
    }
}