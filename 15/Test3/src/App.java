/* BufferedStreams:
-> FileInputStream and FileOutputStream are inefficient...
-> We can wrap a BufferedInputStream around FileInputStream so that larger chunks of data are read and stored in a buffer for reading as desired..

BufferedInputStream reads data from the file in large chunks ans stores the data in an internal buffer..
Data will be supplied from the internal buffer, not from the file...
*/
// Code to implement BuffredInputStream...
import java.io.*;

class App {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        int nextByte;

        try {
            bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Subhasis Das\\Documents\\fund.txt"));
            while ((nextByte = bis.read()) != -1) {
                System.out.print((char)nextByte);
            }
        }

        catch(IOException x){
            System.out.println("Error handled");
        }

        finally{
            try{
                bis.close();
            }

            catch(IOException ob){
                System.out.println("Error handled successfully");
            }
        }
    }
}