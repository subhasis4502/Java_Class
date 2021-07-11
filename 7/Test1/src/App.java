//Abstract class
abstract class Shape{ // An abstract class may or may not have a abstract method
    //abstract method only declared in a abstract class
    abstract void show(); //abstract method has no body
}

class Square extends Shape{ // An abastract class can be inherited 
    void show(){
        System.out.println("Within square");
    }
}

class App{
    public static void main(String[] args) {
        //Shape s = new Shape(); //Error; abstract class can't be instantiated
        Square sq = new Square();
        sq.show();
    }
}