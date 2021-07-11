class Base{
    void print(){
        System.out.println("Base");
    }
}

class Child extends Base{
    void print(){
        super.print(); //Invoke the print function of base class
        System.out.println("Child");
    }
}

class GrandChild extends Child{
    void print(){
        super.print(); //Invoke the print function of child class
        System.out.println("Grandchild");
    }
}

class App{
    public static void main(String[] args) {
        GrandChild g = new GrandChild();
        g.print();
    }
}
