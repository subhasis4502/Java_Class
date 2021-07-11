// an interface can extend other interface
interface IN1
{
	void getName();
}

interface IN2 extends IN1
{
	void getInstitute();
}

class App implements IN2
{
	public void getName()
	{
		System.out.println("Subhasis");
	}
	
	public void getInstitute()
	{
		System.out.println("Jadavpur");
	}
	public static void main(String args[])
	{
		App ob=new App();
		ob.getName();
		ob.getInstitute();
	}
	
}