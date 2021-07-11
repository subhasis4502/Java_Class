class Base
{
	public void print()
	{
		System.out.println("Base");
	}
	
}

class Child extends Base
{
	
	private void print()  //Not acceptable as print is a private method
	{
		System.out.println("Child");
	}
}

class App{
			
	public static void main(String args[])
	{
		Child c=new Child();
	    c.print();
	}

}