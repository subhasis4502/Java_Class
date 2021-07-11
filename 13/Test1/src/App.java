// A try block may have one set of try-catch block....
public class App {
    void fun() {
        try {
            int r1 = 100 / 0;
            System.out.println("within outer try"); // ignored; the previous statement has caused an exception ; if the
                                                    // 2 statements are interchanged, then S.o.p statement will be
                                                    // excuted before the exception is occured..
            try {

                int r = 100 / 0;
                System.out.println("within inner try");
            }

            catch (Exception e) {
                System.out.println("within inner catch");

            }

        } // outer try is closed

        catch (Exception e) {
            System.out.println("within outer catch"); // op
        }
    }

    public static void main(String args[]) {
        App ob = new App();

        ob.fun();
    }
}
