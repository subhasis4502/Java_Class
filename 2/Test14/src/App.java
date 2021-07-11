public class App {

	static int[] elements=new int[4];
	
    //Static block is executed only once 
	static
	{
		elements[0]=1;
		for(int i=1;i<4;i++)
			elements[i]=i+1;
		System.out.println("static block called");
	}
	
	void display()
	{
		for(int i=0;i<elements.length;i++)
			System.out.println(elements[i]);
	}
	
	public static void main(String args[])
	{
		App e1=new App();
		e1.display();
		App e2=new App();
		e2.display();
		
	}
}