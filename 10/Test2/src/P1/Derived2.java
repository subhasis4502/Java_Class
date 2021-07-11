package P1;

public class Derived2 extends P2.Derived1{
    public void pri()
	{
		System.out.println("Private Public: Derived2");
	}
	public void def()
	{
		System.out.println("Def Public: Derived2");
	}
	public void pro()
	{
		System.out.println("Protected Public: Derived2");
	}
	public void pub()
	{
		System.out.println("Public Public: Derived2");
	}
}
