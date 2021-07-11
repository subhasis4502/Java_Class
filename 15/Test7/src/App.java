import java.io.*;

class App {

    char reverse(char str[]) {
        char rev[];
        for (int i = str.length; i >= 0; i--) {
            int j = 0;
            rev[j] = str[i];
            j++;
        }
        return rev;
    }

    int isPalindrom(char str[]) {
        if (str == reverse(str)) {
            return 1;
        }
    }

    void display(char str[]) {
        int i = 0;
        while (str[i] != '\0') {
            System.out.print(str[i] + ' ');
            i++;
        }
    }

    public static void main(String[] args) {
        FileInputStream fis = null;
        App a = new App();
        int nextByte;
        char str[];

        try {
            fis = new FileInputStream("C:\\Users\\Subhasis Das\\Documents\\fund.txt");
            int i = 0;
            while ((nextByte = fis.read()) != -1) {
                if ((char) nextByte != ' ') {
                    str[i] = (char) nextByte;
                    i++;
                } else {
                    if (fis.isPalindrom(str)==1) {
                        fis.display(str);
                        i = 0;
                    }
                }
            }
        }

        catch (IOException e) {
            System.out.println("The file not found");
        }
    }
}
