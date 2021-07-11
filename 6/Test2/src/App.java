/* //Multiple inheritance: 

class Parent1
{
	void fun()
	{
		System.out.println("Parent 1");
	}
}

class Parent2
{
	void fun()
	{
		System.out.println("Parent 2");
	}
}


public class App extends Parent1, Parent2{    //ERROR 
	public static void main(String args[])
	{
		App ob=new App();
		ob.fun();
	}

} */

// Use interface for implementing multiple inheritence

interface In1
{
	default void fun()
	{
		System.out.println("Parent 1");
	}
}

interface In2
{
	default void fun()
	{
		System.out.println("Parent 2");
	}
}


public class App implements In1, In2{
    public void fun(){
        In1.super.fun(); //ambiguity resolution
        In2.super.fun(); //ambiguity resolution
    }
    public static void main(String args[])
	{
		App ob=new App();
		ob.fun();
	}

}