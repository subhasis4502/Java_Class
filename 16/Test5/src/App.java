// Function of hasNextInt():
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int sum = 0,i = 0;
        float mean = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Give input: ");
        while (sc.hasNextInt()){ //checks if the next value we read is of a certain type (int) or the input has ended
            sum += sc.nextInt();
            i++;
        }

        mean = (float)sum/i;

        System.out.println("Mean: " + mean);
    }
}
