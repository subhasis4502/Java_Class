interface A{
    default void show(){
        System.out.println("Interface A");
    }
}

interface B extends A{

}

interface C extends A{

}

class App implements B, C{
    public static void main(String[] args) {
        App a = new App();
        a.show();
    }
}