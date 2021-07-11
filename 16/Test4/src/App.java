//Solution: 02
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();  
        
        sc.nextLine(); //blank call of nextLine() will consume the newline character entered through the previous statement

        System.out.println("Enter your name: ");
        String name = sc.nextLine(); 

        System.out.println(age);
        System.out.println(name);
    }
}
