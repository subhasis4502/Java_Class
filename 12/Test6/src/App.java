// Nested try-catch
public class App {

  void fun() {
    try {
      System.out.println("within outer try"); // op 1
      int r = 100 / 0;

      try {
        System.out.println("within inner try"); // ignored;
        int r1 = 100 / 0;
        

      }

      catch (Exception e) {
        System.out.println("within inner catch"); // ignored;

      }

    } // outer try is closed

    catch (Exception e) {
      System.out.println("within outer catch"); // op 2
    }
  }

  public static void main(String args[]) {
    App ob = new App();

    ob.fun();
  }
}
