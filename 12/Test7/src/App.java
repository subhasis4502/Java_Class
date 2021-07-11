public class App {

    void fun() {
        try {

            System.out.println("within outer try"); // op 1

            try {
                System.out.println("within inner try"); // op 2
                int r = 100 / 0; // if these 2 statements are interchanged; then the error in the 1st statement
                                 // will immediately cause a jump to the Exception handler (catch block);
                                 // skipping the rest of the statements within try blocks

            }

            catch (Exception e) {
                System.out.println("within inner catch"); // op 3

            }

        } // outer try is closed

        catch (Exception e) {
            System.out.println("within outer catch");
        }
    }

    public static void main(String args[]) {
        App ob = new App();

        ob.fun();
    }
}
