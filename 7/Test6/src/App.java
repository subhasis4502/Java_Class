abstract class Shape{
    private int height;
    private int width;

    Shape(int h, int w){
        height = h;
        width = w;
    }

    final int getHeight(){
        return height;
    }

    final int getWidth(){
        return width;
    }

    abstract int getArea();
}

class Rectangle extends Shape{
    Rectangle(int length, int width){
        super(length, width);
    }

    final int getArea(){
        return (this.getHeight()*this.getWidth());
    }
}

class Square extends Shape{
    Square(int length){
        super(length, length);
    }

    final int getArea(){
        //return (this.getHeight()*this.getWidth());
                        //or
        return (super.getHeight()*super.getWidth());
    }
}

class App {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(5, 10);
        System.out.println("The area of the rectangle: " + s1.getArea());

        Shape s2 = new Square(5);
        System.out.println("The area of the square: " + s2.getArea());
    }
}
