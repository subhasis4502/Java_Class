import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        int count = 0;

        System.out.println("Enter input long integer data ");

        while (sc.hasNextLong()) {
            long d = sc.nextLong(); // as soon as a double or character data is taken; the loop will be terminated
            sum += d;
            count++;
        }

        double avg = (double) sum / count;
        System.out.println("Average=" + avg);

    }
}