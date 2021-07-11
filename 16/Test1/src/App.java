//Scanner class:java.util package...
//code to use Scanner class for taking input of String, integer, character, long, double......

import java.util.Scanner;

class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your gender: ");
        char gender = sc.next().charAt(0); //Important
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your mobile number: ");
        long mobNo = sc.nextLong();
        System.out.println("Enter your CGPA: ");
        double cgpa = sc.nextDouble();
        

        System.out.println("Your name is " + name);
        System.out.println("Your gender is " + gender);
        System.out.println("Your age is " + age);
        System.out.println("Your mobile number is " + mobNo);
        System.out.println("Your CGPA is " + cgpa);

    }
}