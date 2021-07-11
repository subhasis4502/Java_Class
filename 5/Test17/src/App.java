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
        if (b1 == b2) //Here it checked the b1 and b2 are refering to the same object or not
            System.out.println("Equal");
        else
            System.out.println("Not Equal"); 

    }

}