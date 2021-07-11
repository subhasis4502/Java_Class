class Base {
	private void print() {
		System.out.println("Base");
	}

}

class Child extends Base {

	public void print() // allowed to make it less strict
	{
		// super.print(); // Error, Base class version is private
		System.out.println("Child");
	}
}

class App {

	public static void main(String args[]) {
		Child c = new Child();
		c.print();
	}

}