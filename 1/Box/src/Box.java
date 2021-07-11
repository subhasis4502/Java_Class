//Operator Overloading
class Box {

    int length;
    int breath;
    int height;

    Box(int a, int b, int c){
        length = a;
        breath = b;
        height = c;
    }

    Box(int a, int b){
        length = a;
        breath = b;
        height = 10;
    }

    Box(int a){
        length = a;
        breath = 5;
        height = 10;
    }

    Box(){
        length = breath = height = 5;
    }

    int volume(){
        return (length*breath*height);
    }
    public static void main(String[] args) {

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
