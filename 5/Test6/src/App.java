class Base{
    int x;
    Base(int x){
        this.x = x;
        System.out.println("Within Base: " + x);
    }
}

class Child extends Base{
    int y;
    Child(int x,int y){
        super(x);
        this.y = y;
        System.out.println("Within child: " + y);
    }
}

class GrandChild extends Child{
    int z;
    GrandChild(int x, int y, int z){
        super(x, y);
        this.z = z;
        System.out.println("Within grandchild: " + z);
    }
}

class App{
    public static void main(String[] args) {
        GrandChild g = new GrandChild(10, 20, 30);
    }
}
