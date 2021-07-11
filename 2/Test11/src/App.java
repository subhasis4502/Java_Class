public class App {
int a;
    //Initialization block
    {
        a = 10;
        System.out.println("Common code and a =" + a);
    }
 
    App(){
        System.out.println("Default constructor");
    }

    App(int x){
        System.out.println("Parameterized constructor");
    }

    public static void main(String[] args) {
        App a1 = new App();
        App a2 = new App(5);
        
        System.out.println(a1.a);
        System.out.println(a2.a);
    }
}
