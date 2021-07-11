abstract class Shape{
    int data1;
    Shape(){
        System.out.println("Base constructor");
        data1 = 10;
    }

    abstract void show(); //If we make this method abstract then we have to define this method in the child class
}

class Square extends Shape{
    int data2;
    Square(){
        System.out.println("Child constructor");
        data2 = 20;
    }

    void show(){
        System.out.println("Within square: " + data2);
    }

    void print(){
        System.out.println("Within print");
    }
}

class App{
    public static void main(String[] args) {
        Shape s = new Square(); 
        System.out.println(s.data1);
        s.show(); // Run time polymorphism
    }
}