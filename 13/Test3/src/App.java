public class App {
    void fun() {
        try {
            System.out.println("Outer try"); // op 1
        }

        finally {
            try {
                System.out.println("Inner try"); // op 2
            }

            catch (Exception e) {
                System.out.println("Inner catch");

            }
            System.out.println("At the end of finally"); // op 3
        }

    }

    public static void main(String args[]) {
        App ob = new App();

        ob.fun();
    }
}
