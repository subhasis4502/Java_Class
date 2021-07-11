//How to create/use Sub packages:
/* public class App {
    public static void main(String[] args) throws Exception {
        Calculate.Multiply.Multiplication m = new Calculate.Multiply.Multiplication();
        System.out.println("Multiply: " + m.product(5, 3));
    }
} */

import Calculate.Multiply.*;

public class App {
	public static void main(String args[])
	{
		Multiplication m = new Multiplication ();
		System.out.println("Multiply: " + m.product(5,3));
	}

}