//How to put 2 public classes in a package? 
/* public class App {
    public static void main(String[] args) {
        pack2.A a = new pack2.A();
        a.display();

        pack2.B b = new pack2.B();
        b.show();
    }
} */

//or

import pack2.A;
import pack2.B;

//or
//import pack2.*;

 class App {
	 
	 public static void main(String args[])
	 {
		 A a=new A();
		 a.display();
		 
		 B b=new B();
		 b.show();
	 }

}
