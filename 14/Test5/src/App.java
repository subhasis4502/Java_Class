class array {
    
}

public class App {
    public static void main(String[] args) throws Exception {
        int a[]=new int[100];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        int i = 0;

        a[1] = 4;
        while(a[i] != '\0'){
            System.out.println(a[i]);
            i++;
        }


    }
}
