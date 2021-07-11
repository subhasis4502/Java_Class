class staticBlock{

    int i;
    static int j;  

    //Static Block
    static{
        //i = 10; //Cannot make a static reference to the non-static field i
        j = 20;
        System.out.println("Static block");
    }

    staticBlock(){
        System.out.println("Default constructor");
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        staticBlock s1 = new staticBlock();
        System.out.println(s1.j);
        System.out.println(staticBlock.j);
        System.out.println(s1.i);
        //System.out.println(staticBlock.i); //As i is non-static so not possible
    }
}
