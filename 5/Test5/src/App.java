class Base{
    int x;
    Base(int x){
        this.x = x;
        System.out.println("Within Base: " + x);
    }
}

class Child extends Base{
    int y;
    Child(int x, int y){
        super(x);
        this.y = y;
        System.out.println("Within child: " + y);
    }
}

class App{
    public static void main(String[] args) {
        Child c = new Child(10, 20);
    }
}
