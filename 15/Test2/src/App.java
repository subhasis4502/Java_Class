//Copy a file into another..
import java.io.*;

class App {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        int nextByte;

        try {
            fis = new FileInputStream("C:\\Users\\Subhasis Das\\Documents\\fund.txt");
            fos = new FileOutputStream("C:\\Users\\Subhasis Das\\Documents\\fund2.txt");
            //fos = new FileOutputStream("fund2.txt") //If no path is specified then it is created in "D:\Java\Class\15\Test2\src\fund2.txt"
            while ((nextByte = fis.read()) != -1) {
                fos.write((char)nextByte);
            }
        }

        catch(IOException x){
            System.out.println("Error handled");
        }

        finally{
            try{
                fis.close();
            }

            catch(IOException ob){
                System.out.println("Error handled successfully");
            }
        }
    }
}