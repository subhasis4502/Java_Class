class Base {
    int x, y;

    Base(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

class App {

    public static void main(String args[]) {
        Base b1 = new Base(10, 20);
        Base b2 = new Base(10, 20);
        Base b3 = b1;

        if (b1 == b3) 
            System.out.println("Equal"); //As both b1 and b3 refering the same object in the memory
        else
            System.out.println("Not Equal");

    }

}