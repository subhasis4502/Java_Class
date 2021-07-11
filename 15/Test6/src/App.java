/* Data Streams:
->Sometimes we want an even higher level of abstraction and wish to read and write data to and from the streams in the form of primitive data types or entire class objects..
->Java has in-built stream classes that automatically convert this into the raw bytes that a stream can use..
*/

//Code to implement DataOutputStream.. 

import java.io.*;

class App {
    public static void main(String[] args) {
        DataOutputStream dos = null;

        try {
            dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("C:\\Users\\Subhasis Das\\Documents\\fund2.txt")));
            dos.writeInt(5);
        }

        catch(IOException e) {
            System.out.println("Error Handled");
        }
    }
}