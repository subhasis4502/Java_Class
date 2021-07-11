class Base{
    private void print(){
        System.out.println("Base class");
    }
}

class App extends Base{
    private void print(){
        //super.print(); //Error, as the base class version is private
        System.out.println("App class");
    }

    public static void main(String[] args) {
        App a = new App();
        a.print();
    }
}
