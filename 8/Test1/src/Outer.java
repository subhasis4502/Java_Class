// Nested class inheritence
class Outer {
    private String msg = "JU IT";
    private void fun() {
        System.out.println("Outer fun");
    }

    class Inner extends Outer{
        private void fun() {
            System.out.println("Inner fun");
        }
    }

    public static void main(String[] args) {
        Outer o=new Outer();   //As Inner class is nested in the outer class
	    Inner i=o.new Inner(); //We have to use the object of the outer class to instantiate the inner class
        i.fun();
        o=i;
        o.fun();
    }
}