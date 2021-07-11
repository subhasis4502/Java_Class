abstract class Shape{
    void show(){
        System.out.println("Within shape");
    }
}

class Square extends Shape{
    void show(){
        System.out.println("Within square");
    }
}

class App{
    public static void main(String[] args) {
        Shape s=new Square();
		s.show();              // Square class show func, RTP 
    }
}