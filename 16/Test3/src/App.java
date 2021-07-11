//To take input of any datatype befor a string
//Solution: 01

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter your age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Enter your name: ");
        String name = br.readLine();

        System.out.println(age);
        System.out.println(name);
    }
}
