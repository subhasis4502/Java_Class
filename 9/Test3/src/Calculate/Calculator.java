package Calculate;

public class Calculator {
    public int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Addition: " + c.add(5, 7));
    }
}
