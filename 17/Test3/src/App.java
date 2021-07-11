interface IN{

}

class Demo implements IN{

}

class App {
    public static void main(String[] args) {
        Class c1 = int.class; //Create an object for int class
        Class c2 = int[].class;
		Class c3 = String.class;
		Class c4 = IN.class;
		Class c5 = Demo.class;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
    }
}
