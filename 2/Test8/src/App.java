//overloading 2 static methods: 
class Adder
{
	static int add(int a, int b)
	{
		return a+b;
	}
	static int add(int a, int b, int c)
	{
		return a+b+c;
	}
}

public class App{
	public static void main(String args[])
	{
        Adder a1 = new Adder();
		System.out.println(Adder.add(1,2)); //Calling static method using class name
		System.out.println(a1.add(1,2,3)); //Calling static method using object name
	}

}
