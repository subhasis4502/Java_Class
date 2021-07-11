//overloading static with non-static member methods:
//[if both of them are taking equal set of parameters, then ambiguity arises]

class Adder
{
	static int add(int a, int b)
	{
        System.out.println("Static member called.");
		return a+b;
	}
	 int add(int a, int b, int c)
	{
        System.out.println("Non static member called.");
		return a+b+c;
	}
}

public class App{
	public static void main(String args[])
	{
		Adder a1=new Adder();
		System.out.println(Adder.add(1,2));
		System.out.println(a1.add(1,2,3));
	}

}
