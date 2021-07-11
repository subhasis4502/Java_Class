interface GIN{
    abstract void display();
}

interface IN1 extends GIN {

}

interface IN2 extends GIN {

}

public class Sample implements IN1, IN2 {
    public void display(){
        System.out.println("GIN");
    }
    public static void main(String[] args) {
        Sample s = new Sample();
        s.display();
    }
}