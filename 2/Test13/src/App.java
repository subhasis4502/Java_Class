public class App {
    
    int[] element; //Declaring reference of an array

    //Intializer Block
    {
        element = new int[10]; //Allocate memory for the array
        for (int i = 0; i < element.length; i++) {
            element[i] = i;
        }
    }

    void display(){
        for (int i = 0; i < element.length; i++) {
            System.out.println(element[i]);
        }
    }

    public static void main(String[] args) {
        App e1 = new App();
        e1.display();
    }

}
