import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your age: ");
        int age = sc.nextInt();                     // Since we are taking the integer input before the String;
        System.out.println("Enter your name: ");    // we are not able to take the string input after the integer
        String name = sc.nextLine();                // after pressing the ENTER button; the string is terminated

//We can't take any other datatype except string as input before a string input 

        System.out.println(age);
        System.out.println(name);

    }
}
