// Static Import: allows us to access the static member of a class directly without using the fully qualified name. It is used for saving the time by typing less.
import static java.lang.System.*;
import static java.lang.Math.*;

public class App {
    public static void main(String[] args) {
        out.println("Hello World");
        out.println(sqrt(6));
        out.println(tan(30));
        out.println(log(2));
    }
}
