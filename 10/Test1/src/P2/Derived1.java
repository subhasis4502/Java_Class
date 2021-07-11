package P2;

import P1.*;

public class Derived1 extends Base {
    public void pri()
	{
		System.out.println("Private Public: Derived1");
	}
	public void def()
	{
		System.out.println("Def Public: Derived1");
	}
	public void pro()
	{
		System.out.println("Protected Public: Derived1");
	}
	public void pub()
	{
		System.out.println("Public Public: Derived1");
	}
}
