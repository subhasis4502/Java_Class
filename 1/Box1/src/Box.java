//Operator Overloading with this reference
class Box {

    int l, b, h;

    Box(int l, int b, int h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box(int l, int b){
        this.l = l;
        this.b = b;
        this.h = 10;
    }

    Box(int l){
        this.l = l;
        this.b = 5;
        this.h = 10;
    }

    Box(){
        l = b = h = 5;
    }

    int volume(){
        return (l*b*h);
    }

    /* 
    public: It must be called outside the port when the program is started
    static: It allows the main to be called without having to instantiate a perticular instance of the class

    */
    public static void main(String[] args) { //args: It reseives any command line argument when the program is executed

        Box b1 = new Box(5, 9, 3);
        Box b2 = new Box(5, 7);
        Box b3 = new Box(5);
        Box b4 = new Box();

        System.out.println("For rectangle 1 area: " + b1.volume());
        System.out.println("For rectangle 2 area: " + b2.volume());
        System.out.println("For rectangle 3 area: " + b3.volume());
        System.out.println("For rectangle 4 area: " + b4.volume());
    }
}
