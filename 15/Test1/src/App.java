/* Input Output:
_____________

I/O Streams: An abstract representation of data connected to some input or output devices... 

Streams in Java:
__________________
-> Helps in writing device independent I/O.. 

Some functions are used for reading/writing from/to different sources/destinations..

-> Built-in support for automatic buffering.. 

-> Supports representation of streams using higher level abstraction (other than just bytes)

-> Reading/Writing primitive data types..

-> Reading/Writing entire objects.. 

-> Built-in formatting for character streams which include conversions to and from other representations.. (ie. int, double).

Basic Stream classes:
____________________

-> InputStream , OutputStream..

-> Many subclasses exist to provide specialized functionality..

 - FileInputStream , FileOutputStream
 - BufferedInputStream, BufferedOutputStream
 - ObjectInputStream, ObjectOutputStream
 - PrintStream
_________________________________________________________________ */

// FileInputStream: Reading data from a file one byte at a time..
import java.io.*;

class App {
    public static void main(String[] args) {
        FileInputStream fis = null;
        int nextByte;

        try {
            fis = new FileInputStream("C:\\Users\\Subhasis Das\\Documents\\fund.txt");
            while ((nextByte = fis.read()) != -1) {
                System.out.print((char)nextByte);
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