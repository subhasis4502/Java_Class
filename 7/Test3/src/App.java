abstract class Shape{
    int data1;
    Shape(){
        System.out.println("Base constructor");
        data1 = 10;
    }

    void show(){
        System.out.println("Within shape: " + data1);
    }
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
        Square sh = new Square();
        System.out.println(sh.data1);
		System.out.println(sh.data2); 

        Shape s = new Square(); 
        System.out.println(s.data1);
		//System.out.println(s.data2); // Shape can not have access to its child data variable
        //s.print(); // Shape can not have access to its child method as well
        s.show(); // Run time polymorphism
    }
}