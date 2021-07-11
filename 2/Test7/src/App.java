public class App {
    
    int data1;
    static int data2 = 10;

    App(int a){
        data1 = a;
    }

    void calculate(){
        System.out.println(data1*data2);
    }

    public static void main(String[] args) {
        App a1 = new App(5);
        App a2 = new App(15);

        System.out.println(a1.data1);
        System.out.println(a2.data1);

        //We can call static members via object or class
        System.out.println(a1.data2);
        System.out.println(App.data2);
    }
}
