/* //Type: 1
import P2.*;

class App {
    public static void main(String[] args) {
        Derived1 d = new Derived1(); 
        d.fin();
    }
} */

/* //Type: 2
public class App {
	public static void main(String args[])
	{
		P2.Derived1 ob=new P2.Derived1();   //use fully qualified path name
		ob.fin();
	}
} */

//Type: 3
public class App {
    public static void main(String args[]) {
        new P2.Derived1().fin(); // instantiate the class and invoking the method at the same time
    }

}