/* 
How to resolve name conflicts?

package pack1  --- A.java, B.java
package pack2 ---- A.java

import pack1.A;
import pack2.A; */

//throw an error; name collison
/* ___________________________________ */
//Resolve this error:

import pack1.A;

public class App {
	public static void main(String args[])
	{
        A ob2=new A();
		ob2.display();

		pack2.A ob1=new pack2.A();
		ob1.display();
		
	}

}