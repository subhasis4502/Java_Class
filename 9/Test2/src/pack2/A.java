/* 
How to hide classes within a package? 
If we omit the access specifier 'public' in the class definition, it will be hidden and will not be available 
from outside the package. 
The classes which are not declared as public can be seen and used by other classes in the same package. 
*/
package pack2;

public class A {
    public void display()
	{
		System.out.println("Class A");
	}
}
